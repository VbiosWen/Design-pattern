package com.vbiso.basic.refreshsmell.visitor_pattern.refresh;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 9:36 PM 2019/2/11
 * @Modified By:
 */
public class Client {


  public static void main(String[] args){
    EmployeeList list=new EmployeeList();
    Employee employee1,employee2,employee3,employee4,employee5;

    employee1=new FulltimeEmployee("六小龄童",3200.00,45);
    employee2=new FulltimeEmployee("章金莱",2000.00,40);
    employee3=new FulltimeEmployee("孙悟空",2400,38);
    employee4=new FulltimeEmployee("齐天大圣",3000,42);

    employee5=new ParttimeEmployee("弼马温",60.00,18);

    list.addEmployee(employee1);
    list.addEmployee(employee2);
    list.addEmployee(employee3);
    list.addEmployee(employee4);
    list.addEmployee(employee5);

    Department department;
    department=new HRDepartment();
    list.accept(department);
    System.out.println("========================================");
    Department department1;
    department1=new FADepartment();
    list.accept(department1);
  }

}
