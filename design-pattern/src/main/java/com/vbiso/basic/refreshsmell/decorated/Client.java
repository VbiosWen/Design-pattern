package com.vbiso.basic.refreshsmell.decorated;

import com.vbiso.basic.refreshsmell.decorated.example.BlackBorderDecorator;
import com.vbiso.basic.refreshsmell.decorated.example.Component;
import com.vbiso.basic.refreshsmell.decorated.example.ScrollBarDecorator;
import com.vbiso.basic.refreshsmell.decorated.example.Window;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 7:34 PM 2018/11/1
 * @Modified By:
 */
public class Client {


  public static void main(String[] args){
    Component component,componentSB;
    component=new Window();
    componentSB=new ScrollBarDecorator(component);
    Component componentBB=new BlackBorderDecorator(componentSB);
    componentBB.display();
  }

}
