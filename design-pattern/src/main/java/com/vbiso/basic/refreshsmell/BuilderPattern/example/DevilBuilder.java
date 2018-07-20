package com.vbiso.basic.refreshsmell.BuilderPattern.example;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:53 2018/7/19
 * @Modified By:
 */
public class DevilBuilder extends ActorBuilder {

  @Override
  public void buildType() {
    actor.setType("this is a devil");
  }

  @Override
  public void buildFace() {
    actor.setFace("devil is a deformed monster");
  }

  @Override
  public void buildSex() {
    actor.setSex("devil is a monster");
  }

  @Override
  public void buildCostume() {
    actor.setCostume("devil wear nothing");
  }

  @Override
  public void buildHairStyle() {
    actor.setHairStyle("devil has no hair");
  }
}
