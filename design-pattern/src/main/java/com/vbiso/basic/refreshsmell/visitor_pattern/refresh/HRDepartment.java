package com.vbiso.basic.refreshsmell.visitor_pattern.refresh;

/**
 * @Author: wenliujie
 * @Description: 人力资源部 (具体访问者)
 * @Date: Created in 9:17 PM 2019/2/11
 * @Modified By:
 */
public class HRDepartment extends Department {


  @Override
  public void visit(FulltimeEmployee fulltimeEmployee) {
    int workTime = fulltimeEmployee.getWorkTime();
    System.out.println("正式员工:" + fulltimeEmployee.getName() + "实际工作时间:" + workTime);
    if (workTime > 40) {
      System.out.println("正式员工:" + fulltimeEmployee.getName() + "加班!");
    } else if (workTime < 40) {
      System.out.println("正式员工:" + fulltimeEmployee.getName() + "请假!");
    }
  }

  @Override
  public void visit(ParttimeEmployee parttimeEmployee) {
    int workTime=parttimeEmployee.getWorkTime();
    System.out.println("临时工:"+parttimeEmployee.getName()+"实际工作时间:"+workTime);
  }
}
