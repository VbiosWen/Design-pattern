package com.vbiso.basic.refreshsmell.BuilderPattern.model;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午11:16 2018/7/18
 * @Modified By:
 */
public abstract class Builder {

  public abstract void buildPartA();

  public abstract void buildPartB();

  public abstract void buildPartC();

  protected Product product=new Product();

  public Product getResult(){
    return product;
  }

}
