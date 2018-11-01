package com.vbiso.basic.refreshsmell.decorated.model;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 7:37 PM 2018/11/1
 * @Modified By:
 */
public class ConcreteDecorator extends Decorator {

  public ConcreteDecorator(Component component) {
    super(component);
  }

  @Override
  public void operation() {
    //调用原有的业务方法
    super.operation();
    addBehavior();//调用新增的业务方法
  }

  private void addBehavior() {
  }
}
