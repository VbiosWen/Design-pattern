package com.vbiso.basic.refreshsmell.singlton;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:30 2018/7/16
 * @Modified By:
 */
public class WeeklyLog implements Cloneable{

  private String name;

  private long date;

  private String content;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getDate() {
    return date;
  }

  public void setDate(long date) {
    this.date = date;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public WeeklyLog clone()  {
    Object object=null;
    try {
      object=super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return (WeeklyLog) object;
  }

  @Override
  public String toString() {
    return "WeeklyLog{" +
        "name='" + name + '\'' +
        ", date=" + date +
        ", content='" + content + '\'' +
        '}';
  }

  public static void main(String[] args){
    WeeklyLog weeklyLog=new WeeklyLog();
    WeeklyLog clone = weeklyLog.clone();
    System.out.println(weeklyLog==clone);
    System.out.println(1L<<7L);
    System.out.println(2);
  }
}
