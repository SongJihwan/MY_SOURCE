package step29.exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
  public List<Member> selectList() throws Exception {
    ArrayList<Member> list = new ArrayList<>();
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db",
          "song",
          "s492334");
      stmt = con.createStatement();
      rs = stmt.executeQuery("select * from MEMBERS");
      
      while (rs.next()) {
        list.add(new Member(rs.getInt("MNO"), rs.getString("MNAME"), 
            rs.getString("EMAIL"), rs.getString("PWD"), rs.getString("TEL")));
      }
      
      return list;
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }

  public int insert(Member member) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = null;
    Statement stmt = null;
  
    try {
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db",
          "song",
          "s492334");
      stmt = con.createStatement();
       
      return stmt.executeUpdate("insert into MEMBERS(MNAME, EMAIL, PWD, TEL) values('"
                                  + member.getName() + "', '" + member.getEmail() 
                                  + "', '" + member.getPassword() + "', '" + member.getTel() + "')");
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public int update(Member member) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = null;
    Statement stmt = null;
    
    try {
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db",
          "song",
          "s492334");
      stmt = con.createStatement();
      return stmt.executeUpdate("update MEMBERS set MNAME='" + member.getName()
                              + "', EMAIL='" + member.getEmail()
                              + "', PWD='" + member.getPassword()
                              + "', TEL='" + member.getTel()
                              + "' where MNO= " + member.getNo());
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public int delete(int no) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = null;
    Statement stmt = null;
    
    try {
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db",
          "song",
          "s492334");
      stmt = con.createStatement();
      return stmt.executeUpdate("delete from MEMBERS where MNO=" + no);
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
}
