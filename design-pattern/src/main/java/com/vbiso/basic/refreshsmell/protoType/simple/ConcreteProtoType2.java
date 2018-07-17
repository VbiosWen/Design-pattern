package com.vbiso.basic.refreshsmell.protoType.simple;

/**
 * @Author: wenliujie
 * @Description:
 * 浅克隆，java中成员变量是基本类型，则赋值的传递则为值的传递，如果是引用类型，则为地址符的传递，所以这种克隆方式是浅克隆，
 * 类，接口，数组为等复杂类型为引用类型，通过直接的赋值只是被赋值的对象的地址指向了赋值对象的地址。所以二者还是相同的.
 * @Date: Created in 下午4:58 2018/7/17
 * @Modified By:
 */
public class ConcreteProtoType2 implements Cloneable {

  private String name;

  private long date;

  private AttatchMent attatchMent;

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

  public AttatchMent getAttatchMent() {
    return attatchMent;
  }

  public void setAttatchMent(AttatchMent attatchMent) {
    this.attatchMent = attatchMent;
  }

  @Override
  public ConcreteProtoType2 clone() {
    Object object=null;
    try {
      object=super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("当前类不支持clone");
    }
    return (ConcreteProtoType2) object;
  }


}
