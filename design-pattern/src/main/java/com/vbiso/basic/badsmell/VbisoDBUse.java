package com.vbiso.basic.badsmell;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: wenliujie
 * @Description:
 * 1. 单一性原则(反例):
 * 本类中牵扯了太多功能
 * 1. 连接数据
 * 2.执行sql语句
 * 3.实体类
 *
 *
 * @Date: Created in 下午11:23 2018/7/5
 * @Modified By:
 */
@Slf4j
public class VbisoDBUse {


  private String userName;

  private String userPassword;

  private String mobile;

  private static final String USERNAME = "root";

  private static final String PASSWORD = "123456";

  private static final String URL = "jdbc:mysql://39.105.5.165:3306/vbiso?useUnicode=true&characterEncoding=utf8&useSSL=false";


  public static Connection getConnection() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      return connection;
    } catch (ClassNotFoundException ex) {
      log.error("can't find mysql driver:", ex);
    } catch (SQLException ex) {
      log.error("can't connect mysql db error:", ex);
    }
    return null;
  }

  public static void closeConnection(Connection connection,Statement statement) {
    try {
      if(statement!=null){
        statement.close();
      }
      if (connection != null) {
        connection.close();
      }
    } catch (SQLException ex) {
      log.error("can't close connection source:", ex);
    }
  }

  public static int excuteInsertSql(Connection connection, VbisoDBUse vbisoDBUse, String sql) {
    PreparedStatement statement = null;
    try {
      statement = connection.prepareStatement(sql);
      statement.setString(1, vbisoDBUse.getUserName());
      statement.setString(2, vbisoDBUse.getUserPassword());
      statement.setString(3, vbisoDBUse.getMobile());
      int i = statement.executeUpdate();
      return i;
    } catch (SQLException ex) {
      log.error("connection createStatement error:", ex);
    } finally {
      closeConnection(connection,statement);
    }
    return -1;
  }


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

  public static void main(String[] args) {
    Connection connection = getConnection();
    VbisoDBUse vbisoDBUse = new VbisoDBUse();
    vbisoDBUse.setMobile("1234535353");
    vbisoDBUse.setUserName("test");
    vbisoDBUse.setUserPassword("3332332");
    String sql = "insert into test(user_name,user_password,user_mobile) values(?,?,?)";
    int i = excuteInsertSql(connection, vbisoDBUse, sql);
    System.out.println(i);
  }


}
