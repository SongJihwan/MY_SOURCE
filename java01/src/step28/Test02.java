package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;


public class Test02 {

  public static void main(String[] args) throws Exception {
    DriverManager.deregisterDriver(new Driver());
    
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java80db?user=song&password=s492334");
    System.out.println("연결성공");
    
    System.out.println("5 / 0 = " + 5/0);
    System.out.println("맑은 날씨입니다.");
    
    con.close();
    
  }

}
