package com.vbiso.basic.refreshsmell.BuilderPattern.model;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午11:19 2018/7/18
 * @Modified By:
 */
public class Director {

  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void setBuilder(Builder builder) {
    this.builder = builder;
  }

  public Product construct(){
    builder.buildPartA();
    builder.buildPartB();
    builder.buildPartC();
    return builder.getResult();
  }
}
