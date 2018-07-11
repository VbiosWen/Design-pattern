package com.vbiso.basic.badsmell.factory;

import com.vbiso.basic.badsmell.factory.inter.Button;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:43 2018/7/11
 * @Modified By:
 */
public class SummerButton implements Button {

  @Override
  public void buttonFunction() {
    System.out.println("this is a summerButton");
  }
}
