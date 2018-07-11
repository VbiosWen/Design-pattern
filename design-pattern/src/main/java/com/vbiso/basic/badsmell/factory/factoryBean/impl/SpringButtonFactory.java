package com.vbiso.basic.badsmell.factory.factoryBean.impl;

import com.vbiso.basic.badsmell.factory.SpringButton;
import com.vbiso.basic.badsmell.factory.factoryBean.ButtonFactory;
import com.vbiso.basic.badsmell.factory.inter.Button;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:44 2018/7/11
 * `
 */
public class SpringButtonFactory implements ButtonFactory {

  @Override
  public Button createButton() {
    return new SpringButton();
  }
}
