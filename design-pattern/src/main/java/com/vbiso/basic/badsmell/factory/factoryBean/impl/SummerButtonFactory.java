package com.vbiso.basic.badsmell.factory.factoryBean.impl;

import com.vbiso.basic.badsmell.factory.SummerButton;
import com.vbiso.basic.badsmell.factory.factoryBean.ButtonFactory;
import com.vbiso.basic.badsmell.factory.inter.Button;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:52 2018/7/11
 * @Modified By:
 */
public class SummerButtonFactory implements ButtonFactory {

  @Override
  public Button createButton() {
    return new SummerButton();
  }
}
