package com.vbiso.basic.refreshsmell.protoType.simple;

/**
 * @Author: wenliujie
 * @Description:
 * 抽象原型类
 * @Date: Created in 下午10:11 2018/7/16
 * @Modified By:
 */
public interface ProtoType {

  ProtoType clone();

  String getAttr();

  void setAttr(String attr);

}
