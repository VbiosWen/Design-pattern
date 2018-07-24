package com.vbiso.basic.refreshsmell.adapter.example.twoWayAdapter;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:58 2018/7/24
 * @Modified By:
 */
public class ConcreteAdaptee implements Adaptee {

  @Override
  public void specificRequest(String str, String str1) {
    System.out.println(str+str1);
  }
}
