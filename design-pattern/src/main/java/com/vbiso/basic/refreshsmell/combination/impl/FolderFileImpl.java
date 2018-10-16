package com.vbiso.basic.refreshsmell.combination.impl;

import com.google.common.collect.Lists;
import com.vbiso.basic.refreshsmell.combination.FileInterface;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:44 2018/10/16
 * @Modified By:
 */
public class FolderFileImpl extends FileInterface {

  private String name;

  private List<FileInterface> list;

  public FolderFileImpl(String name) {
    this.name = name;
    list= Lists.newArrayList();
  }

  @Override
  public void add(FileInterface file) {
    list.add(file);
  }

  @Override
  public void remove(FileInterface file) {
    list.remove(file);
  }

  @Override
  public FileInterface getChild(int i) {

    return list.get(i);
  }

  @Override
  public void killVirus() {
    System.out.println("对当前目录下文件进行杀毒:"+name);
    for(FileInterface fileInterface:list){
      fileInterface.killVirus();
    }
  }
}
