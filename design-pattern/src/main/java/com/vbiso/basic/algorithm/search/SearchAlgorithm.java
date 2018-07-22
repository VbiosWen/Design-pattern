package com.vbiso.basic.algorithm.search;

import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:39 2018/7/22
 * @Modified By:
 */
public interface SearchAlgorithm {

  <T extends Comparable<T>> int search(T[] array, T data);

  default <T extends Comparable<T>> int search(List<T> array, T data) {
    return search(array.toArray((T[]) new Comparable[array.size()]), data);
  }


}
