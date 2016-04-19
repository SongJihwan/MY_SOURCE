package step29.exam05;

import java.util.List;

public class MemberList {

  public static void main(String[] args) throws Exception {
    try {
      DataSource ds = new DataSource("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/java80db", "song", "s492334");
      MemberDao memberDao = new MemberDao();
      memberDao.setDataSource(ds);
      List<Member> list = memberDao.selectList();

      for (Member member : list) {
        System.out.println(member);
      }
      ds.close();
    } catch (Exception e) {
      System.out.println("데이터 가져오는데 실패했습니다.");
    } 
  }
}
