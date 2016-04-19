package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Test08 {

  public static void main(String[] args) throws Exception {
//  DriverManager.deregisterDriver(new Driver());
    Class.forName("com.mysql.jdbc.Driver");
//  Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con = null;
    Statement stmt = null;
    
    try {
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db",
          "song",
          "s492334");
      System.out.println("연결성공");
      stmt = con.createStatement();
      System.out.println("질의 객체 준비 완료");
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  }
}


