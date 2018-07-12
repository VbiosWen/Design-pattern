package com.vbiso.basic.refreshsmell.abstractFactory.practice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:15 2018/7/12
 * @Modified By:
 */
public class WindowsOperationController implements OperationController {

  @Override
  public void play() {
    System.out.println("i can only say: the dead rest in peace");
  }
}
