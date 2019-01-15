package com.vbiso.basic.refreshsmell.chan;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 9:47 PM 2019/1/15
 * @Modified By:
 */
public class SimpleHandler2 implements Handler {

  @Override
  public void processRequest(Object request, Object response,
      Chan chan) {
    System.out.println("do other things");
    chan.handleRequest(request,response);
  }
}
