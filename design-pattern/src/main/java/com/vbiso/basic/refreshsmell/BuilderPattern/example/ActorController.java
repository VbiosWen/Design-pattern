package com.vbiso.basic.refreshsmell.BuilderPattern.example;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:56 2018/7/19
 * @Modified By:
 */
public class ActorController {


  public Actor construct(ActorBuilder actorBuilder){
    actorBuilder.buildType();
    actorBuilder.buildSex();
    actorBuilder.buildFace();
    actorBuilder.buildCostume();
    actorBuilder.buildHairStyle();
    return actorBuilder.createActor();
  }
}
