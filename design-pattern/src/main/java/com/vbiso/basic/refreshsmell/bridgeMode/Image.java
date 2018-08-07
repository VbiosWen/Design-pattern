package com.vbiso.basic.refreshsmell.bridgeMode;

/**
 * @Author: wenliujie
 * @Description: 抽象图像类
 * @Date: Created in 下午10:32 2018/8/7
 * @Modified By:
 */
public abstract class Image {

  protected ImgImpl img;

  public void setImg(ImgImpl img) {
    this.img = img;
  }

  public abstract void parseFile(String fileName);
}
