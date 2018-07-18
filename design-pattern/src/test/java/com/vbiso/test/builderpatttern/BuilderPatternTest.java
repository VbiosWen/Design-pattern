package com.vbiso.test.builderpatttern;

import com.vbiso.basic.refreshsmell.BuilderPattern.model.Builder;
import com.vbiso.basic.refreshsmell.BuilderPattern.model.ConcreteBuilder;
import com.vbiso.basic.refreshsmell.BuilderPattern.model.Director;
import com.vbiso.basic.refreshsmell.BuilderPattern.model.Product;
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

}
