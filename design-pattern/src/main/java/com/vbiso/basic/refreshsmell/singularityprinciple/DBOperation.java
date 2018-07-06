package com.vbiso.basic.refreshsmell.singularityprinciple;


/**
 * @Author: wenliujie
 * @Description:
 * 2.负责进行table的操作
 * @Date: Created in 上午10:20 2018/7/6
 * @Modified By:
 */

public interface DBOperation<T> {


  int insertSql(T entity,String sql);

}
