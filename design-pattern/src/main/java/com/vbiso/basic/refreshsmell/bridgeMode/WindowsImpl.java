package com.vbiso.basic.refreshsmell.bridgeMode;

/**
 * @Author: wenliujie
 * @Description: 具体实现类
 * @Date: Created in 下午10:37 2018/8/7
 * @Modified By:
 */
public class WindowsImpl implements ImgImpl {

  @Override
  public void paint(Matrix matrix) {
    System.out.println("在windows中显示图像");
  }
}
