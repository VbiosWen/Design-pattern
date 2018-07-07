package com.vbiso.basic.badsmell.ocp;

/**
 * @Author: wenliujie
 * @Description:
 * 开闭原则反例
 * 1.在此类中如果想要增加一种动物，就需要在添加一个else if
 * 显然不符合开闭原则的只扩展，不修改的原则
 * @Date: Created in 下午6:21 2018/7/6
 * @Modified By:
 */
public class Animal {


  public void display(String what) {
   if("bananas".equals(what)){
     Monkey monkey=new Monkey();
     monkey.dispaly();
   }else if("grass".equals(what)) {
     Pig pig=new Pig();
     pig.display();
   }
  }

  public static void main(String[] args){
    Animal animal=new Animal();
    animal.display("bananas");
  }

}
