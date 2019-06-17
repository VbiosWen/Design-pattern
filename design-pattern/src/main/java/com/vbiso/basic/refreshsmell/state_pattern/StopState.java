package com.vbiso.basic.refreshsmell.state_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:10 2019-06-17
 * @Modified By:
 */
public class StopState extends LiftState {

  @Override
  public void setContext(Context context) {
    super.setContext(context);
  }

  @Override
  public void close() {
    // do noting
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
    System.out.println("the lift was stopped");
  }
}
