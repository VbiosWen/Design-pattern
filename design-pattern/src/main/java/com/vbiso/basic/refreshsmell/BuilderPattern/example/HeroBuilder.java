package com.vbiso.basic.refreshsmell.BuilderPattern.example;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:50 2018/7/19
 * @Modified By:
 */
public class HeroBuilder extends ActorBuilder {

  @Override
  public void buildType() {
    actor.setType("this is a hero");
  }

  @Override
  public void buildFace() {
    actor.setFace("hero is very handsome");
  }

  @Override
  public void buildSex() {
    actor.setSex("hero is a man");
  }

  @Override
  public void buildCostume() {
    actor.setCostume("hero in armor");
  }

  @Override
  public void buildHairStyle() {
    actor.setHairStyle("hero have short black hair");
  }
}
