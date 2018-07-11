package com.vbiso.basic.refreshsmell.factory.complex;

import com.vbiso.basic.utils.XmlUtil;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:38 2018/7/9
 * @Modified By:
 */
public class Client {

  public static void main(String[] args) throws ClassNotFoundException {
    LoggerFactory loggerFactory;
    loggerFactory= (LoggerFactory) XmlUtil.getBean();
    Logger logger = loggerFactory.createLogger();
    logger.writeLog();
  }

}
