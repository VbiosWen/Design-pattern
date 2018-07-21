package com.vbiso.basic.refreshsmell.BuilderPattern.proctice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:09 2018/7/21
 * @Modified By:
 */
public class MemoryModeBuilder extends WindowsBuilder{

  @Override
  public void buildMenu() {

  }

  @Override
  public void buildVideoList() {
    this.window.setVideoList("memory mode contain video list");
  }

  @Override
  public void buildMainWindow() {
    this.window.setMainWindow("memory window contain main window");
  }

  @Override
  public void buildControlStrip() {
    this.window.setControlStrip("memory mode contain control strip");
  }

  @Override
  public boolean isBuildMenu() {
    return false;
  }
}
