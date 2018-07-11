package com.vbiso.basic.refreshsmell.factory.practice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:27 2018/7/11
 * @Modified By:
 */
public class GifImageFactory extends ImageFactory {

  @Override
  public Image createImage() {
    return new GifImage();
  }
}
