package com.vbiso.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:21 2018/8/2
 * @Modified By:
 */
public class TestTest {


  @Test
  public void test() {
    int pageSize = 100;
    double total = 7.0;
    int ceil = (int) Math.ceil(total / pageSize);
    System.out.println(ceil);

    int text = 30;

    String flag = "";
    flag += text <= 30 && text >= 0 ? "yes" : "no";
    System.out.println(flag);

  }


  @Test
  public void TestBoolean() {
    boolean flag1 = true;
    boolean flag2 = false;
    int i = 0;
    System.out.println(++i);
    System.out.println(i++);
    System.out.println(flag1 = flag2);
    System.out.println(flag1);

    Map<String, String> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    String s = map.get(String.valueOf(1));
    System.out.println(s);
  }

  @Test
  public void testIntBig() {
    int max = Integer.MAX_VALUE;
    System.out.println(max);
  }

  @Test
  public void testIIIII() {
    System.out.println(3 & 3);
    int a = 4;
    System.out.println(a);
    vttt(a);
    System.out.println(a);
  }

  private void vttt(int a) {
    List<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
    for (int i = 0; i < 12; i++) {

    }
    System.out.println(list);
  }


}
