package com.vbiso.basic.refreshsmell.flyweight_pattern;

import com.vbiso.basic.refreshsmell.flyweight_pattern.IgoChessman.BlackIgoChessman;
import com.vbiso.basic.refreshsmell.flyweight_pattern.IgoChessman.WhiteIgoChessman;
import java.util.Hashtable;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 9:17 PM 2019/1/15
 * @Modified By:
 */
public class IgoChessFactory {

  private static IgoChessFactory instance = new IgoChessFactory();

  private static Hashtable ht;

  public IgoChessFactory() {
    ht = new Hashtable();
    IgoChessman black, wt;
    black = new BlackIgoChessman();
    ht.put("b", black);
    wt = new WhiteIgoChessman();
    ht.put("w", wt);
  }

  public static IgoChessFactory getInstance() {
    return instance;
  }

  public  IgoChessman getIgoChessman(String color) {
    return (IgoChessman) ht.get(color);
  }

  static class Client {

    public static void main(String[] args) {
      IgoChessman black1,black2,black3,white1,white2;
      IgoChessFactory factory;
      factory=IgoChessFactory.getInstance();
      black1=factory.getIgoChessman("b");
      black2=factory.getIgoChessman("b");
      black3=factory.getIgoChessman("b");
      System.out.println(black1==black2);
      black1.display();
    }
  }
}


