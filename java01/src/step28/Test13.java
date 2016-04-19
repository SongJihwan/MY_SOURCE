package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Test13 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;;
    
    try {
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db",
          "song",
          "s492334");
      stmt = con.createStatement();
      String input = "1 or MNO=2";
      
      rs =  stmt.executeQuery("select * from MEMBERS where MNO=" + input);
      
      while (rs.next()) {
        System.out.println(rs.getInt("MNO") + ", " + rs.getString("MNAME") + ", " + rs.getString("EMAIL") + rs.getString("PWD"));
      }
       
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  }
}


