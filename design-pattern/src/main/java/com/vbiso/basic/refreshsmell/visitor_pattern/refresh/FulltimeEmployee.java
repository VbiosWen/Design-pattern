package com.vbiso.basic.refreshsmell.visitor_pattern.refresh;

/**
 * @Author: wenliujie
 * @Description: 正式工 (具体元素)
 * @Date: Created in 9:19 PM 2019/2/11
 * @Modified By:
 */
public class FulltimeEmployee implements Employee {

  private String name;

  private double weeklyWage;

  private int workTime;

  public FulltimeEmployee(String name, double weeklyWage, int workTime) {
    this.name = name;
    this.weeklyWage = weeklyWage;
    this.workTime = workTime;
  }

  @Override
  public void accept(Department department) {
    department.visit(this);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getWeeklyWage() {
    return weeklyWage;
  }

  public void setWeeklyWage(double weeklyWage) {
    this.weeklyWage = weeklyWage;
  }

  public int getWorkTime() {
    return workTime;
  }

  public void setWorkTime(int workTime) {
    this.workTime = workTime;
  }
}
