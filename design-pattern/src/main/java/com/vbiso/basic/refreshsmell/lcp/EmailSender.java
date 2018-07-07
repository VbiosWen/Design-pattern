package com.vbiso.basic.refreshsmell.lcp;

/**
 * @Author: wenliujie
 * @Description:
 * 里氏替换原则
 * 在此代码中，通过定义一个基类，baseCustomer，commonCustomer和VIPCustomer通过继承他，来继承他的所有属性，
 * 然后再emailSender中通过传入基类对象发送邮件，只需要实现一个方法就行了。
 * @Date: Created in 下午1:43 2018/7/7
 * @Modified By:
 */
public class EmailSender {

  public void sendEmail(BaseCustomer baseCustomer){
    System.out.println("send email..."+baseCustomer.getEmail());
  }

  public static void main(String[] args){
    EmailSender emailSender = new EmailSender();
    BaseCustomer baseCustomer=new VipCustomer();
    baseCustomer.setEmail("vbiso@qq.com");
    emailSender.sendEmail(baseCustomer);
  }

}
