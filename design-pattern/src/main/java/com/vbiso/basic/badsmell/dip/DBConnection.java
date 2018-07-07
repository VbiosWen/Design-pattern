package com.vbiso.basic.badsmell.dip;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:14 2018/7/7
 * @Modified By:
 */
public interface DBConnection<T> {

  public T getConnection();

}
