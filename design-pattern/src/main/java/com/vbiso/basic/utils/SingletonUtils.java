package com.vbiso.basic.utils;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.collections4.MapUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:08 2018/7/20
 * @Modified By:
 */
public class SingletonUtils {


  private static Map<String, Object> beanMap = new ConcurrentHashMap<String, Object>();

  private static final String LOCALTiON = "/bean.xml";


  private SingletonUtils() {
  }

  public static Object getInstance(String beanName) {
    if (MapUtils.isEmpty(beanMap)) {
      buildBeanMap();
      if (MapUtils.isEmpty(beanMap)) {
        throw new IllegalStateException("bean init failed!");
      }
      return beanMap.get(beanName);
    }
    return beanMap.get(beanName);
  }

  private static void buildBeanMap() {
    //获取bean配置文件
    InputStream input = getBeanConfigFromXml();
    buildBeanConfig(input);
  }

  private static void buildBeanConfig(InputStream input) {
    if (input == null) {
      throw new NullPointerException("can't find " + LOCALTiON);
    }
    try {
      SAXReader reader = new SAXReader();
      Document document = reader.read(input);
      Element root = document.getRootElement();
      buildClassToBean(root);
    } catch (Exception ex) {

    }
  }

  private static void buildClassToBean(Element root) {
    if (root == null) {
      throw new NullPointerException("xml location error");
    }
    List<Element> beanElems = root.elements();
    beanElems.forEach(elem -> {
      List<Attribute> attributes = elem.attributes();
      String key = attributes.get(0).getValue();
      String value = attributes.get(1).getValue();
      beanMap.put(key, Single.getInstance(value));
    });
  }

  private static class Single {

    private static Object object = null;

    private static Object getSingleton(String value) {
      try {
        Class<?> aClass = Class.forName(value);
        object = aClass.newInstance();
      } catch (Exception ex) {
        throw new IllegalStateException("can't find the class:" + value);
      }
      return object;
    }

    public static Object getInstance(String value) {
      return Single.getSingleton(value);
    }
  }

  private static InputStream getBeanConfigFromXml() {
    InputStream inputStream = null;
    try {
      inputStream = SingletonUtils.class.getResourceAsStream(LOCALTiON);
    } catch (RuntimeException ex) {
      throw new RuntimeException(ex);
    }
    return inputStream;
  }

  public static void main(String[] args) {
    Object angelActorBuilder = getInstance("angelActorBuilder");
    AtomicInteger integer = new AtomicInteger(0);
    Lock lock = new ReentrantLock();
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        try {
          Object builder = getInstance("angelActorBuilder");
          System.out.println(builder.hashCode());
          System.out.println(integer.incrementAndGet());
        } catch (Exception ex) {
          throw new RuntimeException("thread-" + integer + "error");
        } finally {
        }
      }).start();
    }
  }
}
