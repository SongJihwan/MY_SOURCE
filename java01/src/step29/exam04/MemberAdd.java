package step29.exam04;

public class MemberAdd {

  public static void main(String[] args) throws Exception {
    MemberDao memberDao = null;
    try {
      memberDao = new MemberDao("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/java80db", "song", "492334");
      
      int cnt = memberDao.insert(new Member("이도", "lee@test.com", "1111", "1111-2222"));  
       
      System.out.println("입력개수 : " + cnt);
      memberDao.destroy();
    } catch (Exception e) {
      System.out.println("데이터 처리중 오류가 발생했습니다.");
    } finally {
      memberDao.destroy();
    }
  }
}


