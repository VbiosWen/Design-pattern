package com.vbiso.basic.refreshsmell.visitor_pattern.refresh;

/**
 * @Author: wenliujie
 * @Description: 抽象员工 (抽象元素)
 * @Date: Created in 9:19 PM 2019/2/11
 * @Modified By:
 */
@FunctionalInterface
public interface Employee {

  void accept(Department department);

}
