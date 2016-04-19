package step30.exam01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bitcamp.pms.annotation.Component;
import bitcamp.pms.domain.Member;
import bitcamp.pms.util.DataSource;

@Component
public class MemberDao {
  DataSource dataSource;

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public List<Member> selectList() throws Exception {
    ArrayList<Member> members = new ArrayList<>();
    Class.forName("com.mysql.jdbc.Driver");
    PreparedStatement stmt = null;
    Connection con = null;
    ResultSet rs = null;
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("select * from MEMBERS");
      rs = stmt.executeQuery();

      while (rs.next()) {
        members.add(new Member(rs.getInt("MNO"), rs.getString("MNAME"), rs.getString("EMAIL"), rs.getString("PWD"),
            rs.getString("TEL")));
      }

      return members;

    } finally {
      try {
        rs.close();
      } catch (Exception e) {
      }
      try {
        stmt.close();
      } catch (Exception e) {
      }
      dataSource.returnConnection(con);
    }

  }

  public int insert(Member member) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    PreparedStatement stmt = null;
    Connection con = null; 
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("insert into MEMBERS(MNAME, EMAIL, PWD, TEL) values(?, ?, ?, ?)");
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());
      return stmt.executeUpdate();

      // return stmt.executeUpdate();
    } finally {
      try {
        stmt.close();
      } catch (Exception e) {
      }
      dataSource.returnConnection(con);
    }
  }

  public Member selectOne(int no) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Connection con = null;
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("select * from MEMBERS where MNO=?");
      stmt.setInt(1, no);
      rs = stmt.executeQuery();

      rs.next();
      return new Member(rs.getInt("MNO"), rs.getString("MNAME"), rs.getString("EMAIl"), rs.getString("PWD"),
          rs.getString("TEL"));
    } finally {
      try {
        rs.close();
      } catch (Exception e) {
      }
      try {
        stmt.close();
      } catch (Exception e) {
      }
      dataSource.returnConnection(con);
    }
  }

  public int update(Member member) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    PreparedStatement stmt = null;
    Connection con = null;
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("update MEMBERS set MNAME=?, EMAIL=?, PWD=?, TEL=? where MNO=?");
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());
      stmt.setInt(5, member.getNo());
      return stmt.executeUpdate();

    } finally {
      try {
        stmt.close();
      } catch (Exception e) {
      }
      dataSource.returnConnection(con);
    }
  }

  public int delete(int no) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    PreparedStatement stmt = null;
    Connection con = null;
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("delete from MEMBERS where MNO=?");
      stmt.setInt(1, no);
      return stmt.executeUpdate();
    } finally {
      try {
        stmt.close();
      } catch (Exception e) {
      }
      dataSource.returnConnection(con);
    }
  }
}
