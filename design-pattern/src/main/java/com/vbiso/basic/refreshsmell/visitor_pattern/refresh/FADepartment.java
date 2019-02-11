package com.vbiso.basic.refreshsmell.visitor_pattern.refresh;

/**
 * @Author: wenliujie
 * @Description: 财务部 (具体访问者)
 * @Date: Created in 9:17 PM 2019/2/11
 * @Modified By:
 */
public class FADepartment extends Department {

  @Override
  public void visit(FulltimeEmployee fulltimeEmployee) {
    int workTime = fulltimeEmployee.getWorkTime();
    double weeklyWage = fulltimeEmployee.getWeeklyWage();

    if (workTime > 40) {
      weeklyWage = weeklyWage + (workTime - 40) * 100;
    } else if (workTime < 40) {
      weeklyWage = weeklyWage - (40 - workTime) * 80;
      if (weeklyWage < 0) {
        weeklyWage = 0;
      }
    }
    System.out.println("正式员工:" + fulltimeEmployee.getName() + "实际工资:" + weeklyWage);
  }

  @Override
  public void visit(ParttimeEmployee parttimeEmployee) {
    int workTime = parttimeEmployee.getWorkTime();
    double hourWage = parttimeEmployee.getHourWage();
    System.out
        .println("临时工:" + parttimeEmployee.getName() + "实际工资为:" + workTime * hourWage);
  }
}
