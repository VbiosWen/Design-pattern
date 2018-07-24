package com.vbiso.test.alrogithm;

import com.vbiso.basic.algorithm.search.BinarySearch;
import com.vbiso.basic.algorithm.search.SearchAlgorithm;
import java.time.Instant;
import java.util.ArrayList;
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
    List<Integer> list = new ArrayList<>(1000000);
    for(int i=0;i<1000000;i++){
      list.add(i);
    }
    long now = Instant.now().toEpochMilli();
    int search = searchAlgorithm.search(list, 6000,true);
    long end=Instant.now().toEpochMilli();
    System.out.println(search);
    System.out.println("cost time:"+(end-now));

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(arr.length);
    int median = (0 + arr.length) >>> 1;
    System.out.println(median);
  }

}
