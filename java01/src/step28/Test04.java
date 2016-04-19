package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;


public class Test04 {

  public static void main(String[] args) throws Exception {
    try(
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java80db",
            "song",
            "s492334")
    ) {
      DriverManager.deregisterDriver(new Driver());
      
      
      System.out.println("연결성공");
      
      System.out.println("5 / 0 = " + 5/0);
      System.out.println("맑은 날씨입니다.");
     
    }
  }
}


