package com.vbiso.basic.refreshsmell.BuilderPattern.example;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:39 2018/7/19
 * @Modified By:
 */
public abstract class ActorBuilder {

  public abstract void buildType();

  public abstract void buildFace();

  public abstract void buildSex();

  public abstract void buildCostume();

  public abstract void buildHairStyle();

  protected Actor actor=new Actor();

  public Actor createActor(){
    return actor;
  }

}
