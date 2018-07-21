package com.vbiso.basic.refreshsmell.BuilderPattern.proctice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:06 2018/7/21
 * @Modified By:
 */
public class StreamLinedModeBuilder extends WindowsBuilder {

  @Override
  public void buildMenu() {

  }

  @Override
  public void buildVideoList() {

  }

  @Override
  public void buildMainWindow() {
    this.window.setMainWindow("streamlined mode contain main window");
  }

  @Override
  public void buildControlStrip() {
    this.window.setControlStrip("streamlined mode contain control strip");
  }

  @Override
  public boolean isBuildMenu() {
    return false;
  }

  @Override
  public boolean isBuildVideoList() {
    return false;
  }
}
