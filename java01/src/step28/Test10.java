package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Test10 {

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
      int cnt = stmt.executeUpdate("insert into MEMBERS(MNAME, EMAIL, PWD) values('강감찬', 'kang@test.com', '111122223333')");
       
      System.out.println("입력개수 : " + cnt);
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  }
}


