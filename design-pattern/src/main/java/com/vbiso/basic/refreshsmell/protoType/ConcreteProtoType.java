package com.vbiso.basic.refreshsmell.protoType;

/**
 * @Author: wenliujie
 * @Description: 具体原型类
 * 1.原型模式 将一个原型对象传给那个要发动创建的对象，通过传参的方式将当前对象的值复制给另一个对象，
 * 这样就能保证了创建了一个新的对象，而不是原对象，也就达到了克隆的概念。
 * @Date: Created in 下午10:12 2018/7/16
 * @Modified By:
 */
public class ConcreteProtoType implements ProtoType {

  private String attr;

  @Override
  public String getAttr() {
    return attr;
  }

  @Override
  public void setAttr(String attr) {
    this.attr = attr;
  }

  @Override
  public ProtoType clone() {
    ProtoType protoType=new ConcreteProtoType();
    protoType.setAttr(this.attr);
    return protoType;
  }
}
