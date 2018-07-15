package com.vbiso.basic.refreshsmell.singlton;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午8:14 2018/7/15
 * @Modified By:
 */
public class Client {

  public static void main(String[] args) {
    int i = (int) (Math.random() * 10);
    while (--i>0) {
      Thread thread = new Thread(() -> {
        LazySingleton lazySingleton = LazySingleton.newInstance();
        System.out.println(lazySingleton.hashCode());
      });
      thread.start();
    }
  }

}
