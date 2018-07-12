package com.vbiso.basic.badsmell.factory;

import com.vbiso.basic.badsmell.factory.factoryBean.ButtonFactory;
import com.vbiso.basic.badsmell.factory.inter.Button;
import com.vbiso.basic.utils.XmlUtil;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:12 2018/7/11
 * @Modified By:
 */
public class Client {

  private static String path="/SubGroup.xml";
  public static void main(String[] args){
    ButtonFactory buttonFactory = XmlUtil.getButtonFactory(path);
    Button button = buttonFactory.createButton();
    button.buttonFunction();
  }

}
