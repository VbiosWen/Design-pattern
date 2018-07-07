package com.vbiso.basic.badsmell.dip;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:14 2018/7/7
 * @Modified By:
 */
public class MongoDBConnection<T extends MyMongoDataBase> implements DBConnection<T> {

  private MyMongoDataBase myMongoDataBase;



  public static void main(String[] args){
    DBConnection dbConnection=new MongoDBConnection();
    MyMongoDataBase myMongoDataBase = (MyMongoDataBase) dbConnection.getConnection();
    MongoCollection<Document> vbiso_users = myMongoDataBase.getMongoDatabase().getCollection("vbiso_users");
    FindIterable<Document> documents = vbiso_users.find().limit(1);
    for (Document document: documents){
      String s = document.toJson();
      System.out.println(s);
    }
  }

  public T getConnection() {
    return null;
  }
}
