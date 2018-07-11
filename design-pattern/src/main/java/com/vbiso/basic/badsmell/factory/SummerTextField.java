package com.vbiso.basic.badsmell.factory;

import com.vbiso.basic.badsmell.factory.inter.TextField;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:04 2018/7/11
 * @Modified By:
 */
public class SummerTextField implements TextField {

  @Override
  public void textFieldFunction() {
    System.out.println("this is a summer text field");
  }
}
