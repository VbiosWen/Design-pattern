package com.vbiso.basic.refreshsmell.bridgeMode;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:41 2018/8/7
 * @Modified By:
 */
public class BmpImg extends Image {

  @Override
  public void parseFile(String fileName) {
    Matrix matrix=new Matrix();
    img.paint(matrix);
    System.out.println(fileName+"格式为bmp");
  }
}
