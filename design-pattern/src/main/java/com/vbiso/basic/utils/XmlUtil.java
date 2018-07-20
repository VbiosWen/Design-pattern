package com.vbiso.basic.utils;

import com.vbiso.basic.badsmell.factory.factoryBean.ButtonFactory;
import com.vbiso.basic.refreshsmell.abstractFactory.SkinFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:12 2018/7/8
 * @Modified By:
 */
@Slf4j
public class XmlUtil {

  public static XmlUtil xmlUtil=new XmlUtil();

  private static Map<String,Object> beanMap=new HashMap<>();

  public static String getType(){
    String type=null;
    try {
      InputStream resourceAsStream = xmlUtil.getClass().getResourceAsStream("/chartType.xml");
      DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
      DocumentBuilder documentBuilder = factory.newDocumentBuilder();
      Document document = documentBuilder.parse(resourceAsStream);
      NodeList nodeList = document.getElementsByTagName("chartType");
      Node node = nodeList.item(0).getFirstChild();
      type = node.getNodeValue().trim();
    } catch (ParserConfigurationException e) {
      log.error("get xml object error:",e);
    } catch (SAXException e) {
      log.error("检查xml文件格式出错",e);
    } catch (IOException e) {
      log.error("未找到对应的配置文件",e);
    }
    return type;
  }

  public static Object getBean() throws ClassNotFoundException {
    try {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      InputStream re = xmlUtil.getClass().getResourceAsStream("/className.xml");
      DocumentBuilder documentBuilder = factory.newDocumentBuilder();
      Document document = documentBuilder.parse(re);
      NodeList nodeList = document.getElementsByTagName("className");
      Node node = nodeList.item(0).getFirstChild();
      String trim = node.getNodeValue().trim();
      Class<?> aClass = Class.forName(trim);
      Object o = aClass.newInstance();
      return o;
    } catch (ParserConfigurationException e) {
      log.error("get xml object error :",e);
    } catch (SAXException | IllegalAccessException | IOException | InstantiationException e) {
      e.printStackTrace();
    }
    return null;
  }


  public static Object getImageBean(String location){
    Object object=null;
    try {
      Document document = getDocument(location);
      NodeList nodeList = document.getElementsByTagName("className");
      String trim=nodeList.item(0).getFirstChild().getNodeValue().trim();
      Class<?> aClass = Class.forName(trim);
      object= aClass.newInstance();
    }catch (Exception ex){
      log.error("get xml object error",ex);
    }
    return object;
  }

  private static Document getDocument(String location)
      throws ParserConfigurationException, IOException, SAXException {
    InputStream resoureInput = xmlUtil.getClass().getResourceAsStream(location);
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = factory.newDocumentBuilder();
    Document document = documentBuilder.parse(resoureInput);
    return document;
  }

  public static ButtonFactory getButtonFactory(String location) {
    ButtonFactory buttonFactory=null;
    try {
      Document document = getDocument(location);
      NodeList nodeList = document.getElementsByTagName("buttonFactory");
      String trim = nodeList.item(0).getFirstChild().getNodeValue().trim();
      buttonFactory = (ButtonFactory) Class.forName(trim).newInstance();
    } catch (ParserConfigurationException | IOException | SAXException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return buttonFactory;
  }

  public static SkinFactory getSkinFactory(String location){
    SkinFactory skinFactory=null;
    try {
      Document document = getDocument(location);
      Element element = document.getDocumentElement();
      NodeList refreshSmell = element.getElementsByTagName("refreshSmell");
      String nodeValue = refreshSmell.item(0).getNodeValue();
      skinFactory = (SkinFactory) Class.forName(nodeValue).newInstance();
    } catch (ParserConfigurationException | IOException | SAXException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return skinFactory;
  }

  public static void buildBean(){
    SAXReader saxReader=new SAXReader();
    InputStream resourceAsStream = xmlUtil.getClass().getResourceAsStream("/test.xml");
    try {
      org.dom4j.Document document = saxReader.read(resourceAsStream);
      org.dom4j.Element rootElement = document.getRootElement();
      getNodes(rootElement);
    } catch (DocumentException e) {
      e.printStackTrace();
    }
  }

  private static void getNodes(org.dom4j.Element rootElement) {
    List<org.dom4j.Element> elements = rootElement.elements();
    elements.forEach(element -> {
      List<org.dom4j.Element> childNode = element.elements();
      childNode.forEach(XmlUtil::invokeBean);
    });

  }

  private static void invokeBean(org.dom4j.Element node) {
    String key = node.getName();
    String value = node.getStringValue();
    try {
      Class<?> aClass = Class.forName(value);
      Constructor<?>[] constructor = aClass.getDeclaredConstructors();
      List<org.dom4j.Element> elements = node.elements();
      elements.forEach(element -> {
        System.out.println(element.getName());
        System.out.println(element.getStringValue());
      });
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }


  public static void main(String[] args){
    buildBean();
  }


}
