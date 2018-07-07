package com.vbiso.basic.badsmell.lcp;

/**
 * @Author: wenliujie
 * @Description:
 * 里氏替换原则
 * 在本类中，commonCustomer和vipCustomer都需要发送短信，
 * 但是发送短信的方式相同，所以造成代码重复，如果在加入一个新的customer，则需要将send方法在重写一个，
 * 这样造成此类的扩展性非常不好，同时代码重复量很大。
 * @Date: Created in 下午1:37 2018/7/7
 * @Modified By:
 */
public class EmailSender {

  public void send(CommonCustomer commonCustomer){
    System.out.println("send to commonCustomer..."+commonCustomer.getEmail());
  }

  public void send(VipCustomer vipCustomer){
    System.out.println("send to vipCustomer"+vipCustomer.getEmail());
  }

  public static void main(String [] args){
    EmailSender emailSender = new EmailSender();
    CommonCustomer commonCustomer = new CommonCustomer();
    commonCustomer.setEmail("vbisowen@qq.com");
    emailSender.send(commonCustomer);
  }

}
