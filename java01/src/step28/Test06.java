package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;


public class Test06 {

  public static void main(String[] args) throws Exception {
    try(
        Connection con = DriverManager.getConnection(
            "jdbc;mysql://localhost2:3307/java80db",
            "song",
            "s492334")
    ) {
      DriverManager.deregisterDriver(new Driver());
      
      System.out.println("연결성공");
    }
    
  }
}


