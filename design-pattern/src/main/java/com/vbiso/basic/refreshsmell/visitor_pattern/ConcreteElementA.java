package com.vbiso.basic.refreshsmell.visitor_pattern;

/**
 * @Author: wenliujie
 * @Description: 具体元素A
 * @Date: Created in 9:08 PM 2019/2/11
 * @Modified By:
 */
public class ConcreteElementA implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
