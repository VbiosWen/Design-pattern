package com.vbiso.basic.refreshsmell.visitor_pattern.refresh;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description: 员工列表 对象结构
 * @Date: Created in 9:18 PM 2019/2/11
 * @Modified By:
 */
public class EmployeeList {

  public List<Employee> list=new ArrayList<>();

  public void addEmployee(Employee employee){
    list.add(employee);
  }

  public void removeEmployee(Employee employee){
    list.remove(employee);
  }

  public void accept(Department department){
    list.forEach(employee -> employee.accept(department)) ;
  }

}
