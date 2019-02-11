package com.vbiso.basic.refreshsmell.visitor_pattern;

/**
 * @Author: wenliujie
 * @Description: 抽象访问者
 * @Date: Created in 9:06 PM 2019/2/11
 * @Modified By:
 */
public abstract class Visitor {


  public abstract void visit(ConcreteElementA elementA);

  public abstract void visit(ConcreteElementB elementB);



}
