package com.vbiso.basic.algorithm.search;

/**
 * @Author: wenliujie
 * @Description: 二分查找，默认为已经排好序的数据
 * @Date: Created in 上午10:38 2018/7/22
 * @Modified By:
 */
public class BinarySearch implements SearchAlgorithm {


  @Override
  public <T extends Comparable<T>> int search(T[] array, T data) {
    return binarySearch(array, data, 0, array.length);
  }

  private <T extends Comparable<T>> int binarySearch(T[] array, T data, int left, int right) {
    if (right < left) {
      return -1;
    }
    int median = (left + right) >>> 1;
    int comp = data.compareTo(array[median]);
    if (comp < 0) {
      return binarySearch(array, data, left, median - 1);
    }

    if (comp > 0) {
      return binarySearch(array, data, median+ 1, right);
    }

    return median;
  }

}
