package com.vbiso.basic.refreshsmell.visitor_pattern.refresh;

/**
 * @Author: wenliujie
 * @Description: 临时工 (具体元素)
 * @Date: Created in 9:20 PM 2019/2/11
 * @Modified By:
 */
public class ParttimeEmployee implements Employee{

  private String name;

  private double hourWage;

  private int workTime;

  public ParttimeEmployee(String name, double hourWage, int workTime) {
    this.name = name;
    this.hourWage = hourWage;
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

  public double getHourWage() {
    return hourWage;
  }

  public void setHourWage(double hourWage) {
    this.hourWage = hourWage;
  }

  public int getWorkTime() {
    return workTime;
  }

  public void setWorkTime(int workTime) {
    this.workTime = workTime;
  }
}
