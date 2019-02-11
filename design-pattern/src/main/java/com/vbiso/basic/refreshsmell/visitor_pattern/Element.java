package com.vbiso.basic.refreshsmell.visitor_pattern;

/**
 * @Author: wenliujie
 * @Description: 抽象元素
 * @Date: Created in 9:08 PM 2019/2/11
 * @Modified By:
 */
public interface Element {

  void accept(Visitor visitor);

}
