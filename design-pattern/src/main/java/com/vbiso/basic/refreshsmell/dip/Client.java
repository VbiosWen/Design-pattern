package com.vbiso.basic.refreshsmell.dip;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:05 2018/7/8
 * @Modified By:
 */
public class Client {

  public static void main(String[] args){
    Base base=new BaseImpl0();
    base.print("Hello World");
    Base base1=new BaseImpl1();
    base1.print("HAHAHA");
  }

}
