package com.vbiso.basic.algorithm.sort;

import static com.vbiso.basic.algorithm.sort.SortUtils.less;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:54 2018/7/18
 * @Modified By:
 */
public class MergeSort implements SortAlgorithm {

  @Override
  @SuppressWarnings("unchecked")
  public <T extends Comparable<T>> T[] sort(T[] array) {
    T[] temp = (T[]) new Comparable[array.length];
    doSort(array, temp, 0, array.length - 1);
    return array;
  }

  private static <T extends Comparable<T>> void doSort(T[] array, T[] temp, int left, int right) {
    if (left < right) {
      int mid = left + (right - left) / 2;
      doSort(array, temp, left, mid);
      doSort(array, temp, mid + 1, right);
      merge(array, temp, left, mid, right);
    }
  }

  private static <T extends Comparable<T>> void merge(T[] array, T[] temp, int left, int mid,
      int right) {
    System.arraycopy(array, left, temp, left, right - left + 1);
    int i = left;
    int j = mid + 1;
    int k = left;
    while (i <= mid && j <= right) {
      if (less(temp[i],temp[j])) {
        array[k] = temp[i];
        i++;
      } else {
        array[k] = temp[j];
        j++;
      }
      k++;
    }
    while (i <= mid) {
      array[k] = temp[i];
      i++;
      k++;
    }
    while (j <= right) {
      array[k] = temp[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    Integer[] arr = {4, 23, 45, 21, 34, 56, 37, 21};
    Double[] doubles={1.2,2.2,2.1,1.2,4.2,2.0};
    String[] strings={"ag","aa","ba","bd","bc"};
    MergeSort mergeSort;
    mergeSort = new MergeSort();
    mergeSort.sort(arr);
    mergeSort.sort(doubles);
    mergeSort.sort(strings);
    SortUtils.println(strings);
    //println(doubles);
    //println(arr);
  }
}
