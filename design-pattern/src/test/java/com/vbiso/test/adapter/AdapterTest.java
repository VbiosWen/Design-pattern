package com.vbiso.test.adapter;

import com.vbiso.basic.algorithm.sort.QuickSort;
import com.vbiso.basic.algorithm.sort.SortAlgorithm;
import com.vbiso.basic.algorithm.sort.SortUtils;
import com.vbiso.basic.refreshsmell.adapter.example.ScoreOperation;
import com.vbiso.basic.utils.SingletonUtils;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午6:50 2018/7/22
 * @Modified By:
 */
public class AdapterTest {

  @Test
  public void testAdapterExample(){
    ScoreOperation  scoreOperation= (ScoreOperation) SingletonUtils.getInstance("scoreOperation");
    Integer [] scores={44,56,7,854,767,4363,62525,546,678,34};
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<10;i++){
      list.add((int) (Math.random()*i*10));
    }
    SortAlgorithm sortAlgorithm=new QuickSort();
    List<Integer> list1 =sortAlgorithm.sort(list);
    SortUtils.print(list1);
    Integer[] integers=new Integer[0];
    SortUtils.println(integers);
    SortUtils.print(scores);

  }

}
