package com.vbiso.basic.badsmell.factory.factoryBean.impl;

import com.vbiso.basic.badsmell.factory.SummerComboBox;
import com.vbiso.basic.badsmell.factory.factoryBean.ComboBoxFactory;
import com.vbiso.basic.badsmell.factory.inter.ComboBox;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:54 2018/7/11
 * @Modified By:
 */
public class SummerComBoxFactory implements ComboBoxFactory {

  @Override
  public ComboBox createComboBox() {
    return new SummerComboBox();
  }
}
