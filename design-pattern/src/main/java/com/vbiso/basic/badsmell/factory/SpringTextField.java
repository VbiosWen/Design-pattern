package com.vbiso.basic.badsmell.factory;

import com.vbiso.basic.badsmell.factory.inter.TextField;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:03 2018/7/11
 * @Modified By:
 */
public class SpringTextField implements TextField {

  @Override
  public void textFieldFunction() {
    System.out.println("this is a spring text field");
  }
}