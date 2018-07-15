package com.vbiso.basic.refreshsmell.singlton;

/**
 * @Author: wenliujie
 * @Description: 饥汉模式 不用考虑线程安全，因为在编译时期，对象已经创建
 * @Date: Created in 下午5:35 2018/7/13
 * @Modified By:
 */
public class SimpleSingleton {

  private static SimpleSingleton simpleSingleton = new SimpleSingleton();

  private SimpleSingleton() {
    if (simpleSingleton != null) {
      throw new IllegalArgumentException();
    }
  }

  public static SimpleSingleton getInstance() {
    return simpleSingleton;
  }


}
