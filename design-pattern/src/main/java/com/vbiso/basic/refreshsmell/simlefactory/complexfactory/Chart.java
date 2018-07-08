package com.vbiso.basic.refreshsmell.simlefactory.complexfactory;

/**
 * @Author: wenliujie
 * @Description:
 * 1.抽象产品对象
 * @Date: Created in 下午10:00 2018/7/8
 * @Modified By:
 */
public interface Chart {

  void display();


  default void chart(){
    System.out.println("we are chart");
  }


}
