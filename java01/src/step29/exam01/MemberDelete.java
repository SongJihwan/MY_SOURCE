package step29.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class MemberDelete {

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
      stmt = con.createStatement();
      int cnt = stmt.executeUpdate("delete from MEMBERS where MNO=6");
       
      System.out.println("삭제개수 : " + cnt);
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  }
}


