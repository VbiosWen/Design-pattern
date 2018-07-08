package com.vbiso.basic.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:59 2018/7/7
 * @Modified By:
 */
public class ThrowAnnalyse {

  public static void testThrow(List<Integer> list){
    try {
      list.get(10);
    }catch (RuntimeException ex){
      ex.printStackTrace();
    }
  }

  public static void main(String[] args){
    List<Integer> list=new ArrayList<>();
    list.addAll(Arrays.asList(1,2,3,4,56,7));
    testThrow(list);
  }

}
