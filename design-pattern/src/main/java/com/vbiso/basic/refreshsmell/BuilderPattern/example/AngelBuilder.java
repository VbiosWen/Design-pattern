package com.vbiso.basic.refreshsmell.BuilderPattern.example;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:39 2018/7/19
 * @Modified By:
 */
public class AngelBuilder extends ActorBuilder {

  @Override
  public void buildType() {
    actor.setType("this is a angel");
  }

  @Override
  public void buildFace() {
    actor.setFace("this is a beautiful angel");
  }

  @Override
  public void buildSex() {
    actor.setSex("this is a woman");
  }

  @Override
  public void buildCostume() {
    actor.setCostume("angel in white skirts");
  }

  @Override
  public void buildHairStyle() {
    actor.setHairStyle("angel is white hair");
  }
}
