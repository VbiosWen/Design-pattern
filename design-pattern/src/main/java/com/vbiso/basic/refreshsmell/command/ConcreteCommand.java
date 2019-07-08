package com.vbiso.basic.refreshsmell.command;

/**
 * @Author: wenliujie
 * @Description: 具体命令类
 * @Date: Created in 22:14 2019-07-08
 * @Modified By:
 */
public class ConcreteCommand extends Command {

  private final Receiver receiver;

  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.action();
  }
}
