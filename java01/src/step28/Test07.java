package step28;

import java.sql.Connection;
import java.sql.DriverManager;


public class Test07 {

  public static void main(String[] args) throws Exception {
//  DriverManager.deregisterDriver(new Driver());
    Class.forName("com.mysql.jdbc.Driver");
//  Class.forName("com.mysql.jdbc.Driver").newInstance();
    try(Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db",
        "song",
        "s492334");) {
      
      System.out.println("연결성공");
    }
  }
}


