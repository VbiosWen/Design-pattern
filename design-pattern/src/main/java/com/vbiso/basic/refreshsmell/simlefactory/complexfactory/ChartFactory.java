package com.vbiso.basic.refreshsmell.simlefactory.complexfactory;

import com.vbiso.basic.refreshsmell.simlefactory.complexfactory.impl.HistogramChart;
import com.vbiso.basic.refreshsmell.simlefactory.complexfactory.impl.LineChart;
import com.vbiso.basic.refreshsmell.simlefactory.complexfactory.impl.PieChart;

/**
 * @Author: wenliujie
 * @Description: 工厂类
 * @Date: Created in 下午10:05 2018/7/8
 * @Modified By:
 */
public class ChartFactory {

  public static Chart getChart(String type){
    Chart chart=null;
    if("histogram".equals(type)){
      chart=new HistogramChart();
      System.out.println("初始化柱状图");
    }else if("pie".equals(type)){
      chart=new PieChart();
      System.out.println("初始化饼状图");
    }else if("line".equals(type)){
      chart=new LineChart();
      System.out.println("初始化折线图");
    }
    return chart;
  }

}
