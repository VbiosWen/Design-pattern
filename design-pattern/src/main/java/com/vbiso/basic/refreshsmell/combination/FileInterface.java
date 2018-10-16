package com.vbiso.basic.refreshsmell.combination;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:39 2018/10/16
 * @Modified By:
 */
public abstract class FileInterface {

  public abstract void add(FileInterface file);

  public abstract void remove(FileInterface file);

  public abstract FileInterface getChild(int i);

  public abstract void killVirus();

}
