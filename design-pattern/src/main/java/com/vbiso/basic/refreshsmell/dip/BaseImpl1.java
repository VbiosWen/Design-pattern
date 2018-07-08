package com.vbiso.basic.refreshsmell.dip;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:06 2018/7/8
 * @Modified By:
 */
public class BaseImpl1 implements Base {

  @Override
  public void print(String args) {
    System.out.println("i'm base's second son"+args);
  }
}
