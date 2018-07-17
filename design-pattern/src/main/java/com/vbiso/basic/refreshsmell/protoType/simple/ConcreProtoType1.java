package com.vbiso.basic.refreshsmell.protoType.simple;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:22 2018/7/16
 * @Modified By:
 */
public class ConcreProtoType1 implements Cloneable {

  private String attr;

  public String getAttr() {
    return attr;
  }

  public void setAttr(String attr) {
    this.attr = attr;
  }

  public ConcreProtoType1 clone(){
    Object object=null;
    try {
      object=super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return (ConcreProtoType1) object;
  }

}
