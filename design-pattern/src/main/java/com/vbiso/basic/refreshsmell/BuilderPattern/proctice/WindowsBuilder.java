package com.vbiso.basic.refreshsmell.BuilderPattern.proctice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:57 2018/7/21
 * @Modified By:
 */
public abstract class WindowsBuilder {

  protected Window window = new Window();

  public abstract void buildMenu();

  public abstract void buildVideoList();

  public abstract void buildMainWindow();

  public abstract void buildControlStrip();

  public boolean isBuildMenu() {
    return true;
  }

  public boolean isBuildVideoList() {
    return true;
  }

  public boolean isBuildControlStrip() {
    return true;
  }

  public Window construct() {
    this.buildMainWindow();

    if (isBuildMenu()) {
      this.buildMenu();
    }
    if (isBuildControlStrip()) {
      this.buildControlStrip();
    }
    if (isBuildVideoList()) {
      this.buildVideoList();
    }
    return this.window;
  }
}
