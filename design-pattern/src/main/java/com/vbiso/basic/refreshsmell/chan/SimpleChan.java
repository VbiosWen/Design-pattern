package com.vbiso.basic.refreshsmell.chan;

import java.util.Iterator;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 9:42 PM 2019/1/15
 * @Modified By:
 */
public class SimpleChan implements Chan {

  private final Iterator<? extends Handler> chan;

  public SimpleChan(Iterator<? extends Handler> chan) {
    this.chan = chan;
  }

  @Override
  public void handleRequest( final Object request, final Object response) {
    if (chan.hasNext()){
      chan.next().processRequest(request,response,this);
      return;
    }
    System.out.println("执行完毕");
  }
}
