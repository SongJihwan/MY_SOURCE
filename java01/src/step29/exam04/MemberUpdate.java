package step29.exam04;

public class MemberUpdate {

  public static void main(String[] args) throws Exception {
    MemberDao memberDao = null;
    try {
      memberDao = new MemberDao("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/java80db", "song", "492334");
      int cnt = memberDao.update(new Member(9, "홍홍홍", "hong@test.com", "1111", "1111-1111"));
      System.out.println("변경개수 : " + cnt); 
      
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("데이터 처리중 오류가 발생했습니다.");
    } finally {
      memberDao.destroy();
    }
  }
}


