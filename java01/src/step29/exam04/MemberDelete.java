package step29.exam04;

public class MemberDelete {

  public static void main(String[] args) throws Exception {
    MemberDao memberDao = null;
    try {
      memberDao = new MemberDao("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/java80db", "song", "492334");
      int cnt = memberDao.delete(8);
      System.out.println("삭제개수 : " + cnt);
      memberDao.destroy();
    } catch(Exception e) {
      System.out.println("데이터 처리중 오류가 발생했습니다.");
    } finally {
      memberDao.destroy();
    }
    
  }
}


