package com.vbiso.basic.refreshsmell.chan;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 9:48 PM 2019/1/15
 * @Modified By:
 */
public class Client {

  public static void main(String[] args){
    List<Handler> list=new ArrayList<>();

    list.add(new SimpleHandler1());
    list.add(new SimpleHandler2());
    Chan chan=new SimpleChan(list.iterator());
    chan.handleRequest(new Object(),new Object());
  }

}
