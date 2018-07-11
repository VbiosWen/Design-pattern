package com.vbiso.basic.badsmell.factory;

import com.vbiso.basic.badsmell.factory.inter.ComboBox;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:50 2018/7/11
 * @Modified By:
 */
public class SummerComboBox implements ComboBox {

  @Override
  public void comboBoxFunction() {
    System.out.println("this is a summer combo box");
  }
}
