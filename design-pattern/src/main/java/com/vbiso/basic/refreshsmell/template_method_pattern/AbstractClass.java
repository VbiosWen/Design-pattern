package com.vbiso.basic.refreshsmell.template_method_pattern;

/**
 * @Author: wenliujie
 * @Description: 抽象父类
 * @Date: Created in 8:55 PM 2019/2/11
 * @Modified By:
 */
public abstract class AbstractClass implements StepClass {


  public void step1(){
    System.out.println("=====step1======");
  }

  public void step2(){
    System.out.println("======step2=======");
  }

  @Override
  public void step(){
    step1();
    step2();
    step3();
    step4();
  }

  /**
   * 抽象子类实现
   */
  public abstract void step3();

  public void step4(){
    System.out.println("======step4=======");
  }


}
