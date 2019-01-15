package com.vbiso.basic.refreshsmell.flyweight_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 9:14 PM 2019/1/15
 * @Modified By:
 */
public abstract class IgoChessman {

  public abstract String getColor();

  public void display() {
    System.out.println("棋子颜色:" + this.getColor());
  }

  static class BlackIgoChessman extends IgoChessman{

    @Override
    public String getColor() {
      return "black";
    }
  }

  static class WhiteIgoChessman extends IgoChessman{

    @Override
    public String getColor() {
      return "white";
    }
  }

}
