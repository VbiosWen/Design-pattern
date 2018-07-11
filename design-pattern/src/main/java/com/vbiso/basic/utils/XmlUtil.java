package com.vbiso.basic.utils;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;
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


  public static Object getImageBean(){
    Object object=null;
    try {
      DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
      InputStream re = xmlUtil.getClass().getResourceAsStream("/imageType.xml");
      DocumentBuilder documentBuilder = factory.newDocumentBuilder();
      Document document = documentBuilder.parse(re);
      NodeList nodeList = document.getElementsByTagName("className");
      String trim=nodeList.item(0).getFirstChild().getNodeValue().trim();
      Class<?> aClass = Class.forName(trim);
      object= aClass.newInstance();
    }catch (Exception ex){
      log.error("get xml object error",ex);
    }
    return object;
  }

  public static void main(String[] args){
    getType();
  }


}
