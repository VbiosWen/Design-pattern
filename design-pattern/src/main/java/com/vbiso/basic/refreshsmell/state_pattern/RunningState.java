package com.vbiso.basic.refreshsmell.state_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:06 2019-06-17
 * @Modified By:
 */
public class RunningState extends LiftState {


  @Override
  public void setContext(Context context) {
    super.setContext(context);
  }

  @Override
  public void close() {
    //do nothing
  }

  @Override
  public void open() {
    // do nothing
  }

  @Override
  public void run() {
    System.out.println("the lift is running.");
  }

  @Override
  public void stop() {
    super.context.setLiftState(Context.stopState);
    super.context.getLiftState().stop();
  }
}
