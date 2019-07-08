package com.vbiso.basic.refreshsmell.command.queue;

import com.vbiso.basic.refreshsmell.command.ConcreteCommand;
import com.vbiso.basic.refreshsmell.command.Receiver;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:21 2019-07-08
 * @Modified By:
 */
public class InvokerQueue {

  private final CommandQueue commandQueue;

  public InvokerQueue(CommandQueue commandQueue) {
    this.commandQueue = commandQueue;
  }

  public void call(){
    commandQueue.execute();
  }

  public static void main(String[] args){
    InvokerQueue invokerQueue = new InvokerQueue(new CommandQueue());
    invokerQueue.commandQueue.addCommand(new ConcreteCommand(new Receiver()));
    invokerQueue.commandQueue.addCommand(new ConcreteCommand(new Receiver()));
    invokerQueue.commandQueue.addCommand(new ConcreteCommand(new Receiver()));
    invokerQueue.call();
  }
}
