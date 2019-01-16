package com.vbiso.basic.refreshsmell.chan;

import java.util.LinkedList;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 9:48 PM 2019/1/15
 * @Modified By:
 */
public class Client {

  public static void main(String[] args){
    LinkedList<Handler> list=new LinkedList<>();

    list.add(new SimpleHandler1());
    list.add(new SimpleHandler2());
    Chan chan=new SimpleChan(list);
    chan.handleRequest(new Object(),new Object());
    chan.handleRequest(new Object(),new Object());
  }

}
