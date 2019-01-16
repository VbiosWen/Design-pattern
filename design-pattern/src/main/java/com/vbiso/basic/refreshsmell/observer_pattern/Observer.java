package com.vbiso.basic.refreshsmell.observer_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 10:02 PM 2019/1/16
 * @Modified By:
 */
public interface Observer {

  String getName();

  void setName(String name);

  void help();

  void beAttacked(AllyController acc);

}
