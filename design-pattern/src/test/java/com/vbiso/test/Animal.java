package com.vbiso.test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 3:48 PM 2018/12/7
 * @Modified By:
 */
public class Animal {


  private String name;

  private int sex;

  private String mobile;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        ", sex=" + sex +
        ", mobile='" + mobile + '\'' +
        '}';
  }
}
