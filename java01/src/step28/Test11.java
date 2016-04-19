package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Test11 {

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
      int cnt = stmt.executeUpdate("update MEMBERS set MNAME='okok', EMAIL='kang2@test.com', PWD='1234' where MNO=6");
       
      System.out.println("변경개수 : " + cnt);
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  }
}


