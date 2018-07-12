package com.vbiso.basic.refreshsmell.abstractFactory;

import com.vbiso.basic.badsmell.factory.SpringButton;
import com.vbiso.basic.badsmell.factory.SpringComboBox;
import com.vbiso.basic.badsmell.factory.SpringTextField;
import com.vbiso.basic.badsmell.factory.inter.Button;
import com.vbiso.basic.badsmell.factory.inter.ComboBox;
import com.vbiso.basic.badsmell.factory.inter.TextField;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午9:56 2018/7/12
 * @Modified By:
 */
public class SpringSkinFactory implements SkinFactory {

  @Override
  public Button createButton() {
    return new SpringButton();
  }

  @Override
  public ComboBox createComboBox() {
    return new SpringComboBox();
  }

  @Override
  public TextField createTextField() {
    return new SpringTextField();
  }
}
