package com.vbiso.basic.refreshsmell.observer_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 10:21 PM 2019/1/16
 * @Modified By:
 */
public class Client {


  public static void main(String[] args){
    AllyController acc=new ConcreteAllyController("金庸群侠");
    Observer player1,player2,player3,player4;

    player1=new Player("杨过");
    acc.join(player1);

    player2=new Player("小龙女");
    acc.join(player2);

    player3=new Player("黄榕");
    acc.join(player3);

    player4=new Player("郭靖");
    acc.join(player4);

    player1.beAttacked(acc);


  }

}
