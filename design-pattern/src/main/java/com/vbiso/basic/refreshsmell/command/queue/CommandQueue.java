package com.vbiso.basic.refreshsmell.command.queue;

import com.google.common.collect.Lists;
import com.vbiso.basic.refreshsmell.command.Command;
import java.util.ArrayList;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:18 2019-07-08
 * @Modified By:
 */
public class CommandQueue {

  private ArrayList<Command> commandArrayList = Lists.newArrayList();

  public void addCommand(Command command){
    commandArrayList.add(command);
  }

  public void removeCommand(Command command){
    commandArrayList.remove(command);
  }

  public void execute(){
    commandArrayList.forEach(Command::execute);
  }

}
