package com.vbiso.basic.refreshsmell.chan;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 9:42 PM 2019/1/15
 * @Modified By:
 */
public interface Handler {

  void processRequest(final Object request,final Object response,final Chan chan);

}
