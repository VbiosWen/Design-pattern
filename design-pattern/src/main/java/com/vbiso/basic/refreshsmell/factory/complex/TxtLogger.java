package com.vbiso.basic.refreshsmell.factory.complex;

/**
 * @Author: wenliujie
 * @Description: 具体产品类
 * @Date: Created in 下午9:36 2018/7/9
 * @Modified By:
 */
public class TxtLogger implements Logger {

  @Override
  public void writeLog() {
    System.out.println("write txt log to file....");
  }
}
