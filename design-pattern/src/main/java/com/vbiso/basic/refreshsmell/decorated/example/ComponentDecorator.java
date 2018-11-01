package com.vbiso.basic.refreshsmell.decorated.example;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 7:41 PM 2018/11/1
 * @Modified By:
 */
public class ComponentDecorator implements Component {

  private final  Component component;

  public ComponentDecorator(Component component) {
    this.component = component;
  }

  @Override
  public void display() {
    component.display();
  }
}
