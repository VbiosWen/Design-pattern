package com.vbiso.basic.refreshsmell.singlton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: wenliujie
 * @Description: 懒汉模式,优化
 * @Date: Created in 下午8:08 2018/7/15
 * @Modified By:
 */
@Slf4j
public class LazySingletonGood {

  //必须保证每次写入内存的对象为最新的,但是会屏蔽jvm所进行的代码优化，同样会影响效率
  private static volatile LazySingletonGood singleton=null;

  private static Lock lock=new ReentrantLock();

  private LazySingletonGood() {
    if(singleton!=null){
      //防止通过反射生成实例
      throw new IllegalArgumentException();
    }
  }

  /**
   * 双重锁定判断，因为当线程A，B 都判断到 singleton==null，然后线程锁定，还是会创建两个对象。
   * @return
   */
  public static LazySingletonGood getSingleton(){
    try {
      if(singleton==null){
        try {
          lock.lock();
          if(singleton==null){
            singleton=new LazySingletonGood();
          }
        }catch (IllegalStateException ex){
          log.error("new Instance error:",ex);
        }finally {
          lock.unlock();
        }
      }
    } catch (Exception e) {
      log.error("未知错误:",e);
    }
    return singleton;
  }

}
