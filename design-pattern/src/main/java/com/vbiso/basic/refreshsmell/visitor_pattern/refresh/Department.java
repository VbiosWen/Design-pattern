package com.vbiso.basic.refreshsmell.visitor_pattern.refresh;

/**
 * @Author: wenliujie
 * @Description: 抽象访问者
 * @Date: Created in 9:16 PM 2019/2/11
 * @Modified By:
 */
public abstract class Department {


  public abstract void visit(FulltimeEmployee fulltimeEmployee);

  public abstract void visit(ParttimeEmployee parttimeEmployee);
}
