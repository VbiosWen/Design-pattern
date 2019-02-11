package com.vbiso.basic.refreshsmell.visitor_pattern;

/**
 * @Author: wenliujie
 * @Description: 具体元素B
 * @Date: Created in 9:09 PM 2019/2/11
 * @Modified By:
 */
public class ConcreteElementB implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
