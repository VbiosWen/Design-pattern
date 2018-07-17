package com.vbiso.test.prototype;

import com.vbiso.basic.refreshsmell.protoType.complex.OfficialDocument;
import com.vbiso.basic.refreshsmell.protoType.complex.ProtoTypeManager;
import com.vbiso.basic.refreshsmell.protoType.simple.AttatchMent;
import com.vbiso.basic.refreshsmell.protoType.simple.ConcreProtoType1;
import com.vbiso.basic.refreshsmell.protoType.simple.ConcreteProtoType;
import com.vbiso.basic.refreshsmell.protoType.simple.ConcreteProtoType2;
import com.vbiso.basic.refreshsmell.protoType.simple.ConcreteProtoType3;
import com.vbiso.basic.refreshsmell.protoType.simple.ProtoType;
import com.vbiso.basic.refreshsmell.singlton.WeeklyLog;
import java.io.IOException;
import java.time.Instant;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:16 2018/7/16
 * @Modified By:
 */
public class ProtoTypeTest {

  @Test
  public void testSimpleProtoType(){
    ProtoType protoType=new ConcreteProtoType();
    protoType.setAttr("test");
    System.out.println(protoType.hashCode());
    ProtoType clone = protoType.clone();
    System.out.println(clone.hashCode());
  }

  @Test
  public void testJavaProtoType(){
    ConcreProtoType1 concreProtoType1 = new ConcreProtoType1();
    concreProtoType1.setAttr("test");
    System.out.println(concreProtoType1.hashCode());
    ConcreProtoType1 clone = concreProtoType1.clone();
    System.out.println(clone.hashCode()+clone.getAttr());
  }

  @Test
  public void testWeeklyLog(){
    WeeklyLog weeklyLog=new WeeklyLog();
    weeklyLog.setDate(Instant.now().toEpochMilli());
    weeklyLog.setContent("hahhahhaahah");
    weeklyLog.setName("vbiso");
    System.out.println(weeklyLog.hashCode()+weeklyLog.toString());
    WeeklyLog clone = weeklyLog.clone();
    System.out.println(clone.hashCode()+clone.toString());
  }

  @Test
  public void testBoolean(){
    String flag="fals";
    Boolean b = Boolean.parseBoolean(flag);
    System.out.println(b);
  }

  @Test
  public void testShallowClone(){
    ConcreteProtoType2 concreteProtoType2=new ConcreteProtoType2();
    AttatchMent attatchMent=new AttatchMent();
    attatchMent.setDownLoad("test");
    attatchMent.setName("hello");
    concreteProtoType2.setAttatchMent(attatchMent);
    concreteProtoType2.setDate(Instant.now().toEpochMilli());
    concreteProtoType2.setName("vbiso");
    System.out.println(concreteProtoType2.hashCode());
    ConcreteProtoType2 clone = concreteProtoType2.clone();
    System.out.println(clone.hashCode());
    System.out.println(clone.getAttatchMent().hashCode()==concreteProtoType2.getAttatchMent().hashCode());
    System.out.println(clone.getDate()==concreteProtoType2.getDate());
  }

  @Test
  public void testDeepClone() throws IOException, ClassNotFoundException {
    ConcreteProtoType3 concreteProtoType=new ConcreteProtoType3();
    AttatchMent attatchMent=new AttatchMent();
    attatchMent.setName("test");
    attatchMent.setDownLoad("test");
    concreteProtoType.setAttatchMent(attatchMent);
    concreteProtoType.setData(Instant.now().toEpochMilli());
    concreteProtoType.setName("vbiso");
    ConcreteProtoType3 concreteProtoType3 = concreteProtoType.deepClone();
    System.out.println(concreteProtoType.hashCode()==concreteProtoType3.hashCode());
    System.out.println(concreteProtoType.getAttatchMent()==concreteProtoType3.getAttatchMent());
  }

  @Test
  public void testProtoTypeManager(){
    ProtoTypeManager protoTypeManager = ProtoTypeManager.getProtoTypeManager();
    OfficialDocument doc1,doc2,doc3,doc4;
    doc1=protoTypeManager.getOfficialDocument("far");
    doc1.display();
    doc2=protoTypeManager.getOfficialDocument("sar");
    doc2.display();
    doc3=protoTypeManager.getOfficialDocument("far");
    doc3.display();
    doc4=protoTypeManager.getOfficialDocument("sar");
    doc4.display();
    System.out.println(doc1==doc3);
    System.out.println(doc2==doc4);
  }

}
