package com.vbiso.basic.refreshsmell.bridgeMode.bridge_model;

/**
 * @Author: wenliujie
 * @Description: 扩充抽象类
 * @Date: Created in 11:35 PM 2019/1/24
 * @Modified By:
 */
public class RefinedAbstraction extends Abstraction {

  @Override
  void operation() {
    implementor.operationImpl();
  }
}
