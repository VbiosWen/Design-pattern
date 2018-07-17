package com.vbiso.basic.refreshsmell.protoType.complex.impl;

import com.vbiso.basic.refreshsmell.protoType.complex.OfficialDocument;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午8:15 2018/7/17
 * @Modified By:
 */
public class FarDocument implements OfficialDocument {

  @Override
  public void display() {
    System.out.println("this is far document");
  }

  @Override
  public OfficialDocument clone(){
    Object object=null;
    try {
      object=super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("this class is not support clone");
    }
    return (OfficialDocument) object;
  }
}
