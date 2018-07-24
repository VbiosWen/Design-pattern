package com.vbiso.basic.refreshsmell.adapter.model;

/**
 * @Author: wenliujie
 * @Description: 适配器类
 * @Date: Created in 下午6:39 2018/7/22
 * @Modified By:
 */
public class Adapter implements Target {

  private Adaptee adaptee;

  public void setAdaptee(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    this.adaptee.specificRequest();
  }
}
