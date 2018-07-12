package com.vbiso.basic.refreshsmell.abstractFactory;

import com.vbiso.basic.badsmell.factory.inter.Button;
import com.vbiso.basic.badsmell.factory.inter.ComboBox;
import com.vbiso.basic.badsmell.factory.inter.TextField;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午9:57 2018/7/12
 * @Modified By:
 */
public class SummerSkinFactory implements SkinFactory {

  @Override
  public Button createButton() {
    return null;
  }

  @Override
  public ComboBox createComboBox() {
    return null;
  }

  @Override
  public TextField createTextField() {
    return null;
  }
}
