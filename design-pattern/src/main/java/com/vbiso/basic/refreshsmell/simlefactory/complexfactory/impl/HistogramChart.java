package com.vbiso.basic.refreshsmell.simlefactory.complexfactory.impl;

import com.vbiso.basic.refreshsmell.simlefactory.complexfactory.Chart;

/**
 * @Author: wenliujie
 * @Description: 具体产品类
 * @Date: Created in 下午10:04 2018/7/8
 * @Modified By:
 */
public class HistogramChart implements Chart {

  public HistogramChart() {
    System.out.println("创建柱状图");
  }

  @Override
  public void display() {
    System.out.println("this is a 柱状图");
  }
}
