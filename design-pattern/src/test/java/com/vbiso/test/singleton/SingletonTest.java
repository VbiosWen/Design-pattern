package com.vbiso.test.singleton;

import com.vbiso.basic.refreshsmell.singlton.IoDHSingleton;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午8:48 2018/7/15
 * @Modified By:
 */
public class SingletonTest {


  @Test
  public void IoDHTest(){
    int i= (int) (Math.random()*20);
    while (i-->0){
      Thread thread=new Thread(()->{
        IoDHSingleton singleton=IoDHSingleton.getInstance();
        System.out.println(singleton.hashCode());
      });
      thread.start();
    }
  }

}
