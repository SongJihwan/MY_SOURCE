package step29.exam05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DataSource {
  ArrayList<Connection> conPool = new ArrayList<>();
  
  String jdbcDriver;
  String jdbcUrl;
  String username;
  String password;
  
  public DataSource() {
    super();
    // TODO Auto-generated constructor stub
  }

  public DataSource(String jdbcDriver, String jdbcUrl, String username, String password) throws Exception {
    super();
    this.jdbcDriver = jdbcDriver;
    this.jdbcUrl = jdbcUrl;
    this.username = username;
    this.password = password;
    
    Class.forName(jdbcDriver);
  }
  
  public Connection getConnection() throws Exception {
    if (conPool.size() > 0) {
      return conPool.remove(0);
    }
    
    return DriverManager.getConnection(jdbcUrl, username, password);
  }
  
  public void returnConnection(Connection con) throws Exception {
    conPool.add(con);
  }
  
  public void close() {
    for (Connection connection : conPool) {
      try {connection.close();} catch (Exception e) {}
    }
  }
}
