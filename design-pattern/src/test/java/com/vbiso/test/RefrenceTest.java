package com.vbiso.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 3:46 PM 2018/12/7
 * @Modified By:
 */
public class RefrenceTest {

  private static final Map<String,Animal> map=new ConcurrentHashMap<>();

  @Test
  public void testInsert(){
    insert();
    Animal animal = getAnimal();
    removeAnimal();
    System.out.println(animal);
  }

  private void removeAnimal() {
    map.remove("animal");
  }

  private Animal getAnimal() {
    return map.get("animal");
  }

  private void insert() {
    Animal animal=new Animal();
    animal.setMobile("15639114941");
    animal.setName("hello");
    animal.setSex(0);
    map.put("animal",animal);
  }

}
