package com.vbiso.basic.refreshsmell.state_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:11 2019-06-17
 * @Modified By:
 */
public class CloseState extends LiftState {



  @Override
  public void setContext(Context context) {
    super.setContext(context);
  }

  @Override
  public void close() {
    System.out.println("the lift door was closed.");
  }

  @Override
  public void open() {
    super.context.setLiftState(Context.openingState);
    super.context.getLiftState().open();
  }

  @Override
  public void run() {
    super.context.setLiftState(Context.runningState);
    super.context.getLiftState().run();
  }

  @Override
  public void stop() {
    super.context.setLiftState(Context.stopState);
    super.context.getLiftState().stop();
  }
}
