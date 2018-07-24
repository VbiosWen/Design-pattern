package com.vbiso.basic.algorithm.sort;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午4:58 2018/7/18
 * @Modified By:
 */
public class SortUtils {


  static <T extends Comparable<T>> boolean less(T v,T w){
    return v.compareTo(w)<0;
  }

  static <T extends Comparable<T>> void swap(T[] array,int v,int w){
    T swap=array[v];
    array[v]=array[w];
    array[w]=swap;

  }

  public static <T extends Comparable<T>> void println(T[] array){
    Arrays.stream(array).forEach(System.out::println);
  }

  public static <T extends Comparable<T>> void println(List<T> list){
     println(list.toArray(new Comparable[list.size()]));
  }

  public static <T extends Comparable<T>> void print(List<T> list){
    print(list.toArray(new Comparable[list.size()]));
  }

  public static <T extends Comparable<T>> void print(T[] array){
    Arrays.stream(array).forEach((T arr)-> System.out.print(arr+"\t"));
    System.out.println("\n");
  }

  public static void main(String[] args){
    Integer a=0,b=1;
    Integer[] c=new Integer[10];
    c[0]=1;c[1]=2;
    swap(c,a,b);
    System.out.println(c[a]+","+c[b]);
  }


}
