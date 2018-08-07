package com.vbiso.test.bridgeMode;

import com.vbiso.basic.refreshsmell.bridgeMode.Image;
import com.vbiso.basic.refreshsmell.bridgeMode.ImgImpl;
import com.vbiso.basic.utils.SingletonUtils;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:44 2018/8/7
 * @Modified By:
 */
public class BridgeModeTest {

  @Test
  public void test(){
    Image image = (Image) SingletonUtils.getInstance("jpgImg");
    ImgImpl windowsImpl;
    windowsImpl = (ImgImpl) SingletonUtils.getInstance("windowsImp");
    image.setImg(windowsImpl);
    image.parseFile("小龙女");
  }

}
