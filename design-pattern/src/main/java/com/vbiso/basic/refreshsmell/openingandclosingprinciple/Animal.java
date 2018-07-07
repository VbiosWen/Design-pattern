package com.vbiso.basic.refreshsmell.openingandclosingprinciple;

/**
 * @Author: wenliujie
 * @Description:
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
