package com.vbiso.basic.refreshsmell.simlefactory.simpleexample;

/**
 * @Author: wenliujie
 * @Description:
 *2. 抽象产品角色,可以为抽象类，也可以为接口
 * 公共方法: car
 * 公共属性: name,createDate
 * @Date: Created in 下午6:28 2018/7/7
 * @Modified By:
 */
public abstract class Product {

  private String name;

  private long createDate;

  public abstract void describe();

  public void car(){
    System.out.println("we are cars...");
  }


}
