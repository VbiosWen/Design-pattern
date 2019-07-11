package com.vbiso.test.alrogithm;

import java.util.Arrays;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 22:05 2019-07-11
 * @Modified By:
 */
public class MergeSortTest {


  @Test
  public void mergeSort() {
    Integer[] array = {4, 5, 1, 23, 56, 7, 3, 46, 7};
    Integer[] temp = new Integer[array.length];
    doMergeSort(array, temp, 0, array.length - 1);
    Arrays.stream(array).forEach(System.out::println);
  }

  private void doMergeSort(Integer[] array, Integer[] temp, int left, int right) {
    if (left < right) {
      int median = left + ((right - left) >> 1);
//      System.out
//          .println("left:" + left + "right:" + right + median + ":" + (left + (right - left) >> 1));
      doMergeSort(array, temp, left, median);
      doMergeSort(array, temp, median + 1, right);
      merge(array, temp, left, median, right);
    }
  }

  private void merge(Integer[] array, Integer[] temp, int left, int median, int right) {
    System.arraycopy(array, left, temp, left, right - left + 1);
    int i = left;
    int j = median + 1;
    int k = left;
    while (i <= median && j <= right) {
      if (temp[i].compareTo(temp[j]) < 0) {
        array[k] = temp[i];
        i++;
      } else {
        array[k] = temp[j];
        j++;
      }
      k++;
    }
    while (i <= median) {
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


  @Test
  public void testCenter() {
    int center = 3 + ((4 - 3) >> 1);
    System.out.println(center);
  }
}
