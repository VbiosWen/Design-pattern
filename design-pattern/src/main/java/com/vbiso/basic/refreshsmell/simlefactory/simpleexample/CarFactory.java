package com.vbiso.basic.refreshsmell.simlefactory.simpleexample;

/**
 * @Author: wenliujie
 * @Description: 1.工厂角色
 * @Date: Created in 下午6:24 2018/7/7
 * @Modified By:
 */
public class CarFactory {

  public static Product making(String carName) {
    Product product = null;
    if ("audi".equals(carName)) {
      product = new AudiCar();
    } else if ("bmw".equals(carName)) {
      product = new BMWCar();
    }
    return product;
  }

  public static void main(String[] args) {
    Product audi = making("audi");
    Product bmw = making("bmw");
  }



}
