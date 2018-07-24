package com.vbiso.basic.algorithm.sort;

import static com.vbiso.basic.algorithm.sort.SortUtils.less;
import static com.vbiso.basic.algorithm.sort.SortUtils.println;
import static com.vbiso.basic.algorithm.sort.SortUtils.swap;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午4:39 2018/7/18
 * @Modified By:
 */
public class QuickSort implements SortAlgorithm {


  @Override
  public <T extends Comparable<T>> T[] sort(T[] array) {
    doSort(array,0,array.length-1);
    return array;
  }

  private static <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
    if(left<right){
      int pivot=partition(array,left,right);
      doSort(array,left,pivot-1);
      doSort(array,pivot,right);
    }
  }

  private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
    int mid=(left+right)/2;
    T pivots=array[mid];
    while (left<=right){
      while (less(array[left],pivots)){
        left++;
      }
      while (less(pivots,array[right])){
        right--;
      }
      if(left<=right){
        swap(array,left,right);
        ++left;
        --right;
      }
    }
    return left;
  }

  public static void main(String[] args){
    Integer[] arrays={4,2,213,35,643,2,64632,1324,43214};
    SortAlgorithm sortAlgorithm=new QuickSort();
    sortAlgorithm.sort(arrays);
//    println(arrays);

    String[] str={"a","c","b","e","d"};
    sortAlgorithm.sort(str);
   // println(str);

    //Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();

    List<Integer> list= Arrays.asList(1,23,53,3,5,4,5,14,144324,2);
    List<Integer> sortList = sortAlgorithm.sort(list);
    println(sortList
    );
  }

}
