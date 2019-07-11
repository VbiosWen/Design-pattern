package com.vbiso.test.alrogithm;

import java.util.Arrays;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 21:35 2019-07-11
 * @Modified By:
 */
public class QuickSortTest {


  @Test
  public void testQuickSort() {
    Integer[] array = {5, 3, 4, 7, 5, 8, 1, 5};
    doSort(array, 0, array.length - 1);
    Arrays.stream(array).forEach(System.out::println);

  }

  private void doSort(Integer[] array, int start, int end) {
    if (start < end) {
      int partion = getPartion(array, start, end);
      doSort(array, start, partion - 1);
      doSort(array, partion, end);
    }
  }

  private int getPartion(Integer[] array, int start, int end) {
    int mid = (start + end) >> 1;
    Integer privots = array[mid];
    while (start <= end) {
      while (array[start].compareTo(privots) < 0) {
        ++start;
      }
      while (array[end].compareTo(privots) > 0) {
        --end;
      }
      if (start <= end) {
        Integer temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
      }
    }
    return start;
  }


}
