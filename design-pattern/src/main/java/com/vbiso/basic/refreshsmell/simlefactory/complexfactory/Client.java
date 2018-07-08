package com.vbiso.basic.refreshsmell.simlefactory.complexfactory;

import com.vbiso.basic.utils.XmlUtil;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:07 2018/7/8
 * @Modified By:
 */
public class Client {


  public static void main(String[] args){
    Chart chart;
    chart=ChartFactory.getChart(XmlUtil.getType());
    chart.display();
    chart.chart();
  }

}
