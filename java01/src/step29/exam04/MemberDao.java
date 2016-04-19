package step29.exam04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MemberDao {
  private Connection con;
 
  public void setCon(Connection con) {
    this.con = con;
  }

  public List<Member> selectList() throws Exception {
    ArrayList<Member> list = new ArrayList<>();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      stmt = con.prepareStatement("select * from MEMBERS");
      rs = stmt.executeQuery();
      
      while (rs.next()) {
        list.add(new Member(rs.getInt("MNO"), rs.getString("MNAME"), 
            rs.getString("EMAIL"), rs.getString("PWD"), rs.getString("TEL")));
      }
      
      return list;
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
    }
  }

  public int insert(Member member) throws Exception {
    PreparedStatement stmt = null;
  
    try {
      stmt = con.prepareStatement("insert into MEMBERS(MNAME, EMAIL, PWD, TEL) values(?, ?, ?, ?)");
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());
      
       
      return stmt.executeUpdate();
    } finally {
      try {stmt.close();} catch (Exception e) {}
    }
  }
  
  public int update(Member member) throws Exception {
    PreparedStatement stmt = null;
    
    try {
      stmt = con.prepareStatement("update MEMBERS set MNAME=?, EMAIL=?, PWD=?, TEL=? where MNO=?");
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());
      stmt.setInt(5, member.getNo());
      return stmt.executeUpdate();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
    }
  }
  
  public int delete(int no) throws Exception {
    PreparedStatement stmt = null;
    
    try {
      stmt = con.prepareStatement("delete from MEMBERS where MNO=?");
      stmt.setInt(1, no);
      return stmt.executeUpdate();
    } finally {
      try {stmt.close();} catch (Exception e) {}
    }
  }
  
  public void destroy() {
    try {con.close();} catch (Exception e) {}
  }
}
