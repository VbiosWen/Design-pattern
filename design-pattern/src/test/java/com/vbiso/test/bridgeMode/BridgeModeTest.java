package com.vbiso.test.bridgeMode;

import com.vbiso.basic.refreshsmell.bridgeMode.Image;
import com.vbiso.basic.refreshsmell.bridgeMode.ImgImpl;
import com.vbiso.basic.utils.SingletonUtils;
import java.util.concurrent.TimeUnit;
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

  @Test
  public void testMerge(){
    System.out.println(String.format("%s,%s",122323L,23332L));
  }


  @Test
  public void testU(){
    System.out.println(TimeUnit.MINUTES.toMillis(5));
  }

}
