package com.vbiso.basic.refreshsmell.protoType.simple;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Author: wenliujie
 * @Description:  深度克隆，即被克隆对象与克隆对象的所有字段只在值上相等，不在内存地址上相同，即引用类型不是同一个对象。
 * 深度克隆,通过序列化方式，将原对象进行序列化，然后再将序列化的对象重新生成，从而达到了深度克隆的目的。
 * @Date: Created in 下午5:25 2018/7/17
 * @Modified By:
 */
public class ConcreteProtoType3 implements Serializable {

  private AttatchMent attatchMent;

  private String name;

  private long data;

  public ConcreteProtoType3 deepClone() throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bao=new ByteArrayOutputStream();
    ObjectOutputStream oop=new ObjectOutputStream(bao);
    oop.writeObject(this);
    ByteArrayInputStream bas=new ByteArrayInputStream(bao.toByteArray());
    ObjectInputStream oip=new ObjectInputStream(bas);
    ConcreteProtoType3 concreteProtoType = (ConcreteProtoType3) oip.readObject();
    return concreteProtoType;
  }


  public AttatchMent getAttatchMent() {
    return attatchMent;
  }

  public void setAttatchMent(AttatchMent attatchMent) {
    this.attatchMent = attatchMent;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getData() {
    return data;
  }

  public void setData(long data) {
    this.data = data;
  }
}
