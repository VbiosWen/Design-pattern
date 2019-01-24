package com.vbiso.basic.refreshsmell.bridgeMode.bridge_model;

/**
 * @Author: wenliujie
 * @Description: 抽象类
 * @Date: Created in 11:33 PM 2019/1/24
 * @Modified By:
 */
public abstract class Abstraction {

  protected   Implementor implementor;

  public void setImplementor(Implementor implementor){
    this.implementor=implementor;
  }

  abstract void operation();

}
