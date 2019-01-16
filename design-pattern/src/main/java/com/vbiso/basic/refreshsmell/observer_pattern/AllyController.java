package com.vbiso.basic.refreshsmell.observer_pattern;

import java.util.ArrayList;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 10:12 PM 2019/1/16
 * @Modified By:
 */
public abstract class AllyController {

  protected String allyName;

  protected ArrayList<Observer> players=new ArrayList<>();


  public void setAllyName(String allyName){
    this.allyName=allyName;
  }

  public String getAllyName() {
    return allyName;
  }

  public void join(Observer obs){
    System.out.println(obs.getName()+" 加入 "+this.allyName+" ");
    players.add(obs);
  }

  public void quit(Observer observer){
    System.out.println(observer.getName()+" 退出 "+ this.allyName+ " ");
    players.remove(observer);
  }

  public abstract void notifyObserver(String name);
}
