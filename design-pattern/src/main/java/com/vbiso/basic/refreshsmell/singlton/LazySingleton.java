package com.vbiso.basic.refreshsmell.singlton;

/**
 * @Author: wenliujie
 * @Description: 懒汉模式
 * 懒汉模式在多线程情况下是不安全的
 * 在多线程情况下，因为多个线程同时执行，可能两个线程同时拿到的lazySingleton都是null，
 * 然后两个同时创建，导致会出现两个对象。显然不符合单例模式的要求。
 * @Date: Created in 上午10:51 2018/7/14
 * @Modified By:
 */
public class LazySingleton {

  private static LazySingleton lazySingleton=null;

  private LazySingleton() {
    throw new IllegalStateException();
  }

  public static LazySingleton newInstance(){
    if(lazySingleton==null){
      lazySingleton=new LazySingleton();
    }
    return lazySingleton;
  }
}
