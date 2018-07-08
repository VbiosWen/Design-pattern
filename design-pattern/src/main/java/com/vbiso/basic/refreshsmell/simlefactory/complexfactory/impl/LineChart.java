package com.vbiso.basic.refreshsmell.simlefactory.complexfactory.impl;

import com.vbiso.basic.refreshsmell.simlefactory.complexfactory.Chart;

/**
 * @Author: wenliujie
 * @Description: 具体产品类
 * @Date: Created in 下午10:02 2018/7/8
 * @Modified By:
 */
public class LineChart implements Chart {

  public LineChart() {
    System.out.println("创建折线图");
  }

  @Override
  public void display() {
    System.out.println("this is a line chart");
  }
}
