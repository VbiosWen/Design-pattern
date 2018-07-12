package com.vbiso.basic.refreshsmell.abstractFactory.practice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:08 2018/7/12
 * @Modified By:
 */
public class AndroidFactory extends SystemFactory {

  @Override
  public InterfaceController createInterfaceController() {
    return new AndroidInterfaceController();
  }

  @Override
  public OperationController createOperationController() {
    return new AndroidOperationController();
  }
}
