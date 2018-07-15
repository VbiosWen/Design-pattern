package com.vbiso.basic.refreshsmell.singlton;

/**
 * @Author: wenliujie
 * @Description: IoDH singleton 这种方式巧妙的使用了java内部静态类的特性，因为内部静态类只有在调用的时候被加载，然后在内部类中声明了一个静态的
 * IoDHSingleton 既保证了资源的合理利用，又能比懒汉模式节省性能。
 * @Date: Created in 下午8:46 2018/7/15
 * @Modified By:
 */
public class IoDHSingleton {

  private IoDHSingleton() {

  }

  private static class HolderClass{
    private static final IoDHSingleton singleton=new IoDHSingleton();

    public static IoDHSingleton getSingleton() {
      return singleton;
    }
  }

  public static IoDHSingleton getInstance(){
    return HolderClass.getSingleton();
  }
}
