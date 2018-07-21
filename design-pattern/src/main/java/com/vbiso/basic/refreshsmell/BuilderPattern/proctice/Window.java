package com.vbiso.basic.refreshsmell.BuilderPattern.proctice;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:55 2018/7/21
 * @Modified By:
 */
public class Window {

  private String menu;

  private String videoList;

  private String mainWindow;

  private String controlStrip;

  public String getMenu() {
    return menu;
  }

  public void setMenu(String menu) {
    this.menu = menu;
  }

  public String getVideoList() {
    return videoList;
  }

  public void setVideoList(String videoList) {
    this.videoList = videoList;
  }

  public String getMainWindow() {
    return mainWindow;
  }

  public void setMainWindow(String mainWindow) {
    this.mainWindow = mainWindow;
  }

  public String getControlStrip() {
    return controlStrip;
  }

  public void setControlStrip(String controlStrip) {
    this.controlStrip = controlStrip;
  }

  @Override
  public String toString() {
    return "Window{" +
        "menu='" + menu + '\'' +
        ", videoList='" + videoList + '\'' +
        ", mainWindow='" + mainWindow + '\'' +
        ", controlStrip='" + controlStrip + '\'' +
        '}';
  }
}
