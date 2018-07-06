package com.vbiso.basic.refreshsmell;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:20 2018/7/6
 * @Modified By:
 */
@Slf4j
public class DBConnection {


  private static final String USERNAME = "root";

  private static final String PASSWORD = "123456";

  private static final String URL = "jdbc:mysql://39.105.5.165:3306/vbiso?useUnicode=true&characterEncoding=utf8&useSSL=false";


  static {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      log.error("can't find mysql driver class error:", e);
    }
  }

  @org.jetbrains.annotations.Nullable
  public static Connection getConnection() {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    } catch (SQLException e) {
      log.error("can't connect mysql error", e);
    }
    return connection;
  }

  public static void closeConnection(Connection connection, Statement statement) {
    try {
      if (statement != null) {
        statement.close();
      }
      if (connection != null) {
        connection.close();
      }
    } catch (SQLException e) {
      log.error("db source close error:",e);
    }
  }

}
