package com.vbiso.basic.refreshsmell.BuilderPattern.model;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午11:21 2018/7/18
 * @Modified By:
 */
public class ConcreteBuilder  extends Builder{

  @Override
  public void buildPartA() {
    product.setPartA("白色头发");
  }

  @Override
  public void buildPartB() {
    product.setPartB("红色的衣服");
  }

  @Override
  public void buildPartC() {
    product.setPartC("蓝色的鞋子");
  }
}
