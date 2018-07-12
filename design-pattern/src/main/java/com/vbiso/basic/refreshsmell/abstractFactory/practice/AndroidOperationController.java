package com.vbiso.basic.refreshsmell.abstractFactory.practice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:12 2018/7/12
 * @Modified By:
 */
public class AndroidOperationController implements OperationController {

  @Override
  public void play() {
    System.out.println("this is a google's system");
  }
}
