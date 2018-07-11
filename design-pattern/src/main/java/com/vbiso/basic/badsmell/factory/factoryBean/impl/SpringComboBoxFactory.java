package com.vbiso.basic.badsmell.factory.factoryBean.impl;

import com.vbiso.basic.badsmell.factory.SpringComboBox;
import com.vbiso.basic.badsmell.factory.factoryBean.ComboBoxFactory;
import com.vbiso.basic.badsmell.factory.inter.ComboBox;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:53 2018/7/11
 * @Modified By:
 */
public class SpringComboBoxFactory implements ComboBoxFactory {

  @Override
  public ComboBox createComboBox() {
    return new SpringComboBox();
  }
}
