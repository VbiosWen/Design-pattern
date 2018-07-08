package com.vbiso.basic.interfaces;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午9:54 2018/7/8
 * @Modified By:
 */
public class SonImpl implements SonInterface {

  @Override
  public void print(String st) {
    System.out.println("....."+st);
  }
}
