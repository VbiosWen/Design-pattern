package com.vbiso.basic.refreshsmell.observer_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 10:18 PM 2019/1/16
 * @Modified By:
 */
public class ConcreteAllyController extends AllyController {

  public ConcreteAllyController(String allyName) {
    System.out.println(allyName+ "战队组建成功!");
    System.out.println("------------------------");
    this.allyName=allyName;
  }



  @Override
  public void notifyObserver(String name) {
    System.out.println(this.allyName+" 战队紧急通知,盟友 "+ name);
    for(Observer obs:players){
      if(obs.getName().equalsIgnoreCase(name)){
        continue;
      }
      obs.help();
    }
  }
}
