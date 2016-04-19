package step29.exam04;

import java.util.List;

public class MemberList {

  public static void main(String[] args) throws Exception {
    MemberDao memberDao = null;
    try {
      memberDao = new MemberDao("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/java80db", "song", "492334");
      List<Member> list = memberDao.selectList();

      for (Member member : list) {
        System.out.println(member);
      }
      memberDao.destroy();
    } catch (Exception e) {
      System.out.println("데이터 가져오는데 실패했습니다.");
    } finally {
      memberDao.destroy();
    }
  }
}
