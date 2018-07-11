package com.vbiso.basic.badsmell.factory.factoryBean.impl;

import com.vbiso.basic.badsmell.factory.SummerTextField;
import com.vbiso.basic.badsmell.factory.factoryBean.TextFieldFactory;
import com.vbiso.basic.badsmell.factory.inter.TextField;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:07 2018/7/11
 * @Modified By:
 */
public class SummerTextFieldFactory implements TextFieldFactory {

  @Override
  public TextField createTextField() {
    return new SummerTextField();
  }
}
