package com.vbiso.basic.refreshsmell.observer_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 10:16 PM 2019/1/16
 * @Modified By:
 */
public class Player implements Observer {

  private String name;

  public Player(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name=name;
  }

  @Override
  public void help() {
    System.out.println("坚持住,"+ this.name+" 来救你!");
  }

  @Override
  public void beAttacked(AllyController acc) {
    System.out.println(this.name+"  被攻击!");
    acc.notifyObserver(name);
  }
}
