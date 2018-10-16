package com.vbiso.basic.refreshsmell.abstractFactory;

import com.vbiso.basic.badsmell.factory.inter.Button;
import com.vbiso.basic.badsmell.factory.inter.ComboBox;
import com.vbiso.basic.badsmell.factory.inter.TextField;
import com.vbiso.basic.utils.XmlUtil;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午11:01 2018/7/12
 * @Modified By:
 */
public class Client {

  public static void main(String[] args){
    String path = "/SubGroup.xml";
    SkinFactory skinFactory = XmlUtil.getSkinFactory(path);
    Button button = skinFactory.createButton();
    ComboBox comboBox = skinFactory.createComboBox();
    TextField textField = skinFactory.createTextField();
    button.buttonFunction();comboBox.comboBoxFunction();textField.textFieldFunction();

  }

}
