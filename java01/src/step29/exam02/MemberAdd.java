package step29.exam02;

public class MemberAdd {

  public static void main(String[] args) throws Exception {
    try {
      MemberDao memberDao = new MemberDao();
      
      int cnt = memberDao.insert(new Member("이도", "lee@test.com", "1111", "1111-2222"));  
       
      System.out.println("입력개수 : " + cnt);
    } catch (Exception e) {
      System.out.println("데이터 처리중 오류가 발생했습니다.");
    }
  }
}


