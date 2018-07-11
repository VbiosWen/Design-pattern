package com.vbiso.basic.refreshsmell.factory.complex;

/**
 * @Author: wenliujie
 * @Description: 具体工厂类
 * @Date: Created in 下午9:37 2018/7/9
 * @Modified By:
 */
public class DataBaseLoggerFactory implements LoggerFactory {

  @Override
  public Logger createLogger() {
    return new DataBaseLogger();
  }
}
