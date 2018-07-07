package com.vbiso.basic.refreshsmell.ocp;

/**
 * @Author: wenliujie
 * @Description:
 * 开闭原则
 * 在开闭原则下，通过一个抽象的Animal类，使得所有的动物继承此抽象类，然后再通过传入对象的方式
 * 实现各个动物的操作。开闭原则在这种情况可以很好的帮助我们在进行动物的拓展，比如说再加一个dog，只需要
 * 继承AbstractAnimal类就可以实现了，无需在修改其他类
 * @Date: Created in 下午6:34 2018/7/6
 * @Modified By:
 */
public class Animal extends AbstarctAnimal {

  private AbstarctAnimal abstarctAnimal;

  public AbstarctAnimal getAbstarctAnimal() {
    return abstarctAnimal;
  }

  public void setAbstarctAnimal(
      AbstarctAnimal abstarctAnimal) {
    this.abstarctAnimal = abstarctAnimal;
  }

  public void display() {
    abstarctAnimal.display();
  }

  public static void main(String[] args){
    AbstarctAnimal monkey=new Monkey();
    Animal animal=new Animal();
    animal.setAbstarctAnimal(monkey);
    animal.display();
    animal.setAbstarctAnimal(new Pig());
    animal.display();
  }
}
