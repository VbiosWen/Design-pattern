package com.vbiso.basic.refreshsmell.factory.simple;

/**
 * @Author: wenliujie
 * @Description: 具体工厂类
 * @Date: Created in 下午9:27 2018/7/9
 * @Modified By:
 */
public class ConcreteFactory implements Factory{

  @Override
  public Factory factoryMethod() {
    return new ConcreteFactory();
  }
}
