package com.vbiso.basic.refreshsmell.simlefactory;

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
    making("audi");
    making("bmw");
    int big=0b1_1111_11;
    System.out.println(big);
  }

}
