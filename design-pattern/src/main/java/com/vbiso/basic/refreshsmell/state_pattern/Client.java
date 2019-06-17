package com.vbiso.basic.refreshsmell.state_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:25 2019-06-17
 * @Modified By:
 */
public class Client {

  public static void main(String[] args){
    Context context = new Context();
    context.setLiftState(new CloseState());
    context.open();
    context.close();
    context.run();
    context.stop();
  }

}
