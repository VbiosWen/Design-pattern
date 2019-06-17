package com.vbiso.basic.refreshsmell.state_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:05 2019-06-17
 * @Modified By:
 */
public abstract class LiftState {

  protected Context context;

  public void setContext(Context context) {
    this.context = context;
  }

  public abstract void close();

  public abstract void open();

  public abstract void run();

  public abstract void stop();

}
