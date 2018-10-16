package com.vbiso.basic.refreshsmell.combination.impl;

import com.vbiso.basic.refreshsmell.combination.FileInterface;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:43 2018/10/16
 * @Modified By:
 */
public class TextFileImpl extends FileInterface {

  private String name;

  public TextFileImpl(String name) {
    this.name = name;
  }

  @Override
  public void add(FileInterface file) {
    System.out.println("sorry the method is not supported");
  }

  @Override
  public void remove(FileInterface file) {
    System.out.println("sorry the method is not supported");
  }

  @Override
  public FileInterface getChild(int i) {
    System.out.println("sorry the method is not supported");
    return null;
  }

  @Override
  public void killVirus() {
    System.out.println(name+" is killing Virus");
  }
}
