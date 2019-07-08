package com.vbiso.basic.refreshsmell.command;

/**
 * @Author: wenliujie
 * @Description: 具体调用者
 * @Date: Created in 22:13 2019-07-08
 * @Modified By:
 */
public class Invoker {

  private final Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void call(){
    this.command.execute();
  }

  public static void main(String[] args){
    Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
    invoker.call();
  }
}
