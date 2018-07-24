package com.vbiso.basic.refreshsmell.adapter.example;

import com.vbiso.basic.algorithm.search.BinarySearch;
import com.vbiso.basic.algorithm.search.SearchAlgorithm;
import com.vbiso.basic.algorithm.sort.QuickSort;
import com.vbiso.basic.algorithm.sort.SortAlgorithm;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午6:45 2018/7/22
 * @Modified By:
 */
public class OperationAdapter implements ScoreOperation {

  private SortAlgorithm sortAlgorithm;

  private SearchAlgorithm searchAlgorithm;

  public OperationAdapter() {
    sortAlgorithm=new QuickSort();
    searchAlgorithm=new BinarySearch();
  }

  public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
    this.sortAlgorithm = sortAlgorithm;
  }

  public void setSearchAlgorithm(SearchAlgorithm searchAlgorithm) {
    this.searchAlgorithm = searchAlgorithm;
  }

  @Override
  public Integer[] sort(Integer[] array) {
    return sortAlgorithm.sort(array);
  }

  @Override
  public int binarySearch(Integer[] array, int key) {
    return searchAlgorithm.search(array,key,false);
  }
}
