package com.vbiso.basic.refreshsmell.adapter.example.twoWayAdapter;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:58 2018/7/24
 * @Modified By:
 */
public class ConcreteTarget implements Target {

  @Override
  public void request(String str) {
    System.out.println(str);
  }
}
