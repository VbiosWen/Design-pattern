package com.vbiso.basic.algorithm.sort;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午4:47 2018/7/18
 * @Modified By:
 */
public interface SortAlgorithm {

  <T extends Comparable<T>> T[] sort(T[] unsorted);


  default <T extends Comparable<T>> List<T> sort(List<T> unsorted){
     return Arrays.asList(sort(unsorted.toArray((T[])new Comparable[unsorted.size()])));
  }

}
