package com.vbiso.basic.refreshsmell.state_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:04 2019-06-17
 * @Modified By:
 */
public class Context{

  public static final OpeningState openingState = new OpeningState();

  public static final CloseState closeState = new CloseState();

  public static final RunningState runningState = new RunningState();

  public static final StopState stopState = new StopState();

  private LiftState liftState;

  public void setLiftState(LiftState liftState) {
    this.liftState = liftState;
    this.liftState.setContext(this);
  }

  public LiftState getLiftState() {
    return liftState;
  }

  public void close() {
    this.liftState.close();
  }

  public void open() {
    this.liftState.open();
  }

  public void run() {
    this.liftState.run();
  }

  public void stop() {
    this.liftState.stop();
  }
}
