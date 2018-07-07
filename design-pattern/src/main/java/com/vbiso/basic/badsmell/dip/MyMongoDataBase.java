package com.vbiso.basic.badsmell.dip;


import com.mongodb.client.MongoDatabase;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:35 2018/7/7
 * @Modified By:
 */
public class MyMongoDataBase{

  private MongoDatabase mongoDatabase;


  public MongoDatabase getMongoDatabase() {
    return mongoDatabase;
  }

  public void setMongoDatabase(MongoDatabase mongoDatabase) {
    this.mongoDatabase = mongoDatabase;
  }
}
