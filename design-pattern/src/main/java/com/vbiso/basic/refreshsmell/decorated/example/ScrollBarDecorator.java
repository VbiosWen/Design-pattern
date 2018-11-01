package com.vbiso.basic.refreshsmell.decorated.example;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 7:42 PM 2018/11/1
 * @Modified By:
 */
public class ScrollBarDecorator extends ComponentDecorator {

  public ScrollBarDecorator(Component component) {
    super(component);
  }

  @Override
  public void display() {
    this.setScrollbar();
    super.display();
  }

  private void setScrollbar() {
    System.out.println("为构件增加滚动条");
  }
}
