package com.vbiso.basic.refreshsmell.factory.practice;

import com.vbiso.basic.utils.XmlUtil;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:28 2018/7/11
 * @Modified By:
 */
public class Client {

  public static void main(String[] args){
    ImageFactory imageFactory = (ImageFactory) XmlUtil.getImageBean("/imageType.xml");
    Image image = imageFactory.createImage();
    image.readImage();
  }

}
