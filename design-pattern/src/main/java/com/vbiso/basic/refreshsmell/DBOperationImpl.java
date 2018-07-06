package com.vbiso.basic.refreshsmell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: wenliujie
 * @Description:
 * 表操作的实现类
 * @Date: Created in 上午11:26 2018/7/6
 * @Modified By:
 */
@Slf4j
public class DBOperationImpl implements DBOperation<UserDo> {


  public int insertSql(UserDo entity, String sql) {
    int result = -1;
    Connection connection =null;
    PreparedStatement statement=null;
    try {
      connection=DBConnection.getConnection();
      statement= connection.prepareStatement(sql);
      statement.setString(1, entity.getUserName());
      statement.setString(2, entity.getUserPassword());
      statement.setString(3, entity.getMobile());
      result = statement.executeUpdate();
    } catch (SQLException e) {
      log.error("prepareStatement method error:", e);
    }finally {
      DBConnection.closeConnection(connection,statement);
    }
    return result;
  }
}
