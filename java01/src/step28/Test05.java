package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;


public class Test05 {

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
     
    } catch (Exception e) {
      System.out.println("잠시 DBMS와 연결이 원활하지 않습니다.\n잠시 후 다시 연결해주세요.");
    }
  }
}


