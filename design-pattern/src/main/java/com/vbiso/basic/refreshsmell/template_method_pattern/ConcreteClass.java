package com.vbiso.basic.refreshsmell.template_method_pattern;

/**
 * @Author: wenliujie
 * @Description: 具体子类
 * @Date: Created in 8:56 PM 2019/2/11
 * @Modified By:
 */
public class ConcreteClass extends AbstractClass {

  @Override
  public void step3() {
    System.out.println("======step3======");
  }


  public static void main(String[] args){
    StepClass stepClass=new ConcreteClass();
    stepClass.step();
  }
}
