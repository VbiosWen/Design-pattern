package com.vbiso.basic.badsmell.factory;

import com.vbiso.basic.badsmell.factory.inter.Button;
import com.vbiso.basic.badsmell.factory.inter.TextField;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:42 2018/7/11
 * @Modified By:
 */
public class SpringButton implements Button {

  @Override
  public void buttonFunction() {
    System.out.println("this is a spring button");
  }

}
