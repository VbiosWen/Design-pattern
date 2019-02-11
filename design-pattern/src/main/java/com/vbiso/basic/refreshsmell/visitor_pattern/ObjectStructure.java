package com.vbiso.basic.refreshsmell.visitor_pattern;

import java.util.ArrayList;

/**
 * @Author: wenliujie
 * @Description: 对象结构
 * @Date: Created in 9:09 PM 2019/2/11
 * @Modified By:
 */
public class ObjectStructure {


  public ArrayList<Element> list=new ArrayList<>();


  public void accept(Visitor visitor){
    list.forEach(element -> element.accept(visitor));
  }

  public void addElement(Element element){
    list.add(element);
  }

  public void removeElement(Element element){
    list.remove(element);
  }

}
