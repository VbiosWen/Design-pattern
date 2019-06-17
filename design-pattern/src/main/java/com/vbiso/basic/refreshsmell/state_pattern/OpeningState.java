package com.vbiso.basic.refreshsmell.state_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:10 2019-06-17
 * @Modified By:
 */
public class OpeningState extends LiftState {

  @Override
  public void setContext(Context context) {
    super.setContext(context);
  }

  @Override
  public void close() {
    super.context.setLiftState(Context.closeState);
    super.context.getLiftState().close();
  }

  @Override
  public void open() {
    System.out.println("the lift is opening");
  }

  @Override
  public void run() {
    //do nothing
  }

  @Override
  public void stop() {
    //do noting
  }
}
