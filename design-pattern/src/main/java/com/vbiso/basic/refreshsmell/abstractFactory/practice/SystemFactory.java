package com.vbiso.basic.refreshsmell.abstractFactory.practice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:03 2018/7/12
 * @Modified By:
 */
public abstract class SystemFactory {


  public abstract InterfaceController createInterfaceController();

  public abstract OperationController createOperationController();


}
