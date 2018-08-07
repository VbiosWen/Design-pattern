package com.vbiso.basic.refreshsmell.bridgeMode;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:38 2018/8/7
 * @Modified By:
 */
public class JpgImg extends Image{

  @Override
  public void parseFile(String fileName) {
    Matrix m=new Matrix();
    img.paint(m);
    System.out.println(fileName+"格式为jpg");
  }
}
