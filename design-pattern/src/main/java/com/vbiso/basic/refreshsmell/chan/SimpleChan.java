package com.vbiso.basic.refreshsmell.chan;

import java.util.LinkedList;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 9:42 PM 2019/1/15
 * @Modified By:
 */
public class SimpleChan implements Chan {

  //private final Iterator<? extends Handler> chan;

  private final LinkedList<? extends Handler> chan;

  public SimpleChan(LinkedList<? extends Handler> chan) {
    this.chan = chan;
  }

  @Override
  public void handleRequest( final Object request, final Object response) {

    if(chan.size()>0){
      chan.removeFirst().processRequest(request,response,this);
    }
   // System.out.println("执行完毕");
  }

  @Override
  public void revertHandle() {

  }


}
