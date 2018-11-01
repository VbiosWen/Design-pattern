package com.vbiso.basic.refreshsmell.decorated.model;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 7:36 PM 2018/11/1
 * @Modified By:
 */
public class Decorator implements Component {

  private Component component;

  public Decorator(Component component) {
    this.component = component;
  }

  @Override
  public void operation() {
    this.component.operation();
  }
}
