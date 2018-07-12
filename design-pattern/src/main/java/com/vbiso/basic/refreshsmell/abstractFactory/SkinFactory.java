package com.vbiso.basic.refreshsmell.abstractFactory;

import com.vbiso.basic.badsmell.factory.inter.Button;
import com.vbiso.basic.badsmell.factory.inter.ComboBox;
import com.vbiso.basic.badsmell.factory.inter.TextField;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午9:56 2018/7/12
 * @Modified By:
 */
public interface SkinFactory {

  Button createButton();

  ComboBox createComboBox();

  TextField createTextField();

}
