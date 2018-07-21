package com.vbiso.basic.refreshsmell.BuilderPattern.proctice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:00 2018/7/21
 * @Modified By:
 */
public class FullModeBuilder extends WindowsBuilder{

  @Override
  public void buildMenu() {
    this.window.setMenu("full mode contain menu");
  }

  @Override
  public void buildVideoList() {
    this.window.setVideoList("full mode contain video list");
  }

  @Override
  public void buildMainWindow() {
    this.window.setMainWindow("full mode contain main window");
  }

  @Override
  public void buildControlStrip() {
    this.window.setControlStrip("full mode contain control strip");
  }
}
