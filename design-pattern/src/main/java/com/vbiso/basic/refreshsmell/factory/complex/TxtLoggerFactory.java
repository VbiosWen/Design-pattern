package com.vbiso.basic.refreshsmell.factory.complex;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:38 2018/7/9
 * @Modified By:
 */
public class TxtLoggerFactory implements LoggerFactory {

  @Override
  public Logger createLogger() {
    return new TxtLogger();
  }
}
