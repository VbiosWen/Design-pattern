package com.vbiso.basic.refreshsmell.protoType;

import java.io.Serializable;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午4:59 2018/7/17
 * @Modified By:
 */
public class AttatchMent implements Serializable{

  private static final long serialVersionUID = -6292901929888152879L;


  private String name;

  private String downLoad;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDownLoad() {
    System.out.println("start download");
    return downLoad;
  }

  public void setDownLoad(String downLoad) {
    this.downLoad = downLoad;
  }
}
