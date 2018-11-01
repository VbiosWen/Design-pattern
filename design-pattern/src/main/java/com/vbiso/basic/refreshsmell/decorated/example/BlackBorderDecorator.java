package com.vbiso.basic.refreshsmell.decorated.example;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 7:44 PM 2018/11/1
 * @Modified By:
 */
public class BlackBorderDecorator extends ComponentDecorator {

  public BlackBorderDecorator(Component component) {
    super(component);
  }

  @Override
  public void display() {
    this.setBlackBorder();
    super.display();
  }

  private void setBlackBorder() {
    System.out.println("为构件增加黑色边框");
  }
}
