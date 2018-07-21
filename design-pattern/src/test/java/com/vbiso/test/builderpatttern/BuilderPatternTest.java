package com.vbiso.test.builderpatttern;

import com.vbiso.basic.refreshsmell.BuilderPattern.example.Actor;
import com.vbiso.basic.refreshsmell.BuilderPattern.example.ActorBuilder;
import com.vbiso.basic.refreshsmell.BuilderPattern.example.ActorController;
import com.vbiso.basic.refreshsmell.BuilderPattern.model.Builder;
import com.vbiso.basic.refreshsmell.BuilderPattern.model.ConcreteBuilder;
import com.vbiso.basic.refreshsmell.BuilderPattern.model.Director;
import com.vbiso.basic.refreshsmell.BuilderPattern.model.Product;
import com.vbiso.basic.refreshsmell.BuilderPattern.proctice.Window;
import com.vbiso.basic.refreshsmell.BuilderPattern.proctice.WindowsBuilder;
import com.vbiso.basic.utils.SingletonUtils;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午11:24 2018/7/18
 * @Modified By:
 */
public class BuilderPatternTest {


  @Test
  public void testBuilderPatternModel(){
    Builder builder=new ConcreteBuilder();
    Director director=new Director(builder);
    Product construct = director.construct();
    System.out.println(construct.getPartA()+":"+construct.getPartB()+":"+construct.getPartC());

  }

  @Test
  public void testStringFormat(){
    String pattern="%s%s%s";
    String format = String.format(pattern, "test", "vbiso","test","test");
    System.out.println(format);
  }

  @Test
  public void testException(){
    throw new NullPointerException("wenliujie");
  }

  @Test
  public void testExample(){
    ActorBuilder builder= (ActorBuilder) SingletonUtils.getInstance("angelActorBuilder");
    ActorController actorController=new ActorController();
    Actor construct = actorController.construct(builder);
    System.out.println(construct.toString());
    ActorBuilder builder1= (ActorBuilder) SingletonUtils.getInstance("heroActorBuilder");
    System.out.println(actorController.construct(builder1));
  }

  @Test
  public void testPractice(){
    WindowsBuilder builder = (WindowsBuilder) SingletonUtils.getInstance("fullModeBuilder");
    Window win = builder.construct();
    System.out.println(win.toString());

    WindowsBuilder builder1= (WindowsBuilder) SingletonUtils.getInstance("memoryModeBuilder");
    Window construct = builder1.construct();
    System.out.println(construct.toString());
  }
}
