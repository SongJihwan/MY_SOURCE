package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Test14 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;;
    
    try {
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db",
          "song",
          "s492334");
      String str = "1 or MNO=2";
      stmt = con.prepareStatement("select * from MEMBERS where MNO=?");
      
      stmt.setString(1, str);
      
      rs =  stmt.executeQuery();
      
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


