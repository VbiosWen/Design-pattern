package com.vbiso.basic.refreshsmell.srp;

/**
 * @Author: wenliujie
 * @Description:
 * 3.负责数据的操作
 * @Date: Created in 上午10:21 2018/7/6
 * @Modified By:
 */
public class UserDo {

  private String userName;

  private String userPassword;

  private String mobile;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
}
