package com.vbiso.basic.refreshsmell.adapter.example.twoWayAdapter;

/**
 * @Author: wenliujie
 * @Description: 双向适配器，设配器和适配者类相互调用
 * @Date: Created in 下午9:56 2018/7/24
 * @Modified By:
 */
public class Adapter implements Target,Adaptee {

  private Adaptee adaptee;

  private Target target;

  public void setAdaptee(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  public void setTarget(Target target) {
    this.target = target;
  }

  @Override
  public void specificRequest(String str, String str1) {
    target.request(str);
  }

  @Override
  public void request(String str) {
    adaptee.specificRequest(str,"test");
  }
}
