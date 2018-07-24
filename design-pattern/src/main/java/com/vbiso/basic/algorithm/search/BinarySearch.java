package com.vbiso.basic.algorithm.search;

/**
 * @Author: wenliujie
 * @Description: 二分查找，默认为已经排好序的数据
 * @Date: Created in 上午10:38 2018/7/22
 * @Modified By:
 */
public class BinarySearch implements SearchAlgorithm {


  @Override
  public <T extends Comparable<T>> int search(T[] array, T data, boolean isRecursive) {
    return isRecursive ? binarySearchNoRecursive(array, data, 0, array.length)
        : binarySearch(array, data, 0, array.length);
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
      return binarySearch(array, data, median + 1, right);
    }

    return median;
  }

  private <T extends Comparable<T>> int binarySearchNoRecursive(T[] array, T data, int left,
      int right) {
    if (right < left) {
      return -1;
    }
    int median = 0;
    while (left < right) {
      median = (left + right) >>> 1;
      int comp = data.compareTo(array[median]);
      if (comp < 0) {
        right = median + 1;
      }
      if (comp > 0) {
        left = median + 1;
      }
      if (comp == 0) {
        break;
      }
    }
    return median;
  }

}
