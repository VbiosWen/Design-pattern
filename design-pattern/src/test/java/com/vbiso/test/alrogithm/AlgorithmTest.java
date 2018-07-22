package com.vbiso.test.alrogithm;

import com.vbiso.basic.algorithm.search.BinarySearch;
import com.vbiso.basic.algorithm.search.SearchAlgorithm;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午4:46 2018/7/22
 * @Modified By:
 */
public class AlgorithmTest {


  @Test
  public void testBinarySearch() {
    SearchAlgorithm searchAlgorithm = new BinarySearch();
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    int search = searchAlgorithm.search(list, 9);
    System.out.println(search);

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(arr.length);
    int median = (0 + arr.length) >>> 1;
    System.out.println(median);
  }

}
