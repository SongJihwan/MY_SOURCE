package step29.exam03;

public class MemberUpdate {

  public static void main(String[] args) throws Exception {
    try {
      MemberDao memberDao = new MemberDao();
      int cnt = memberDao.update(new Member(9, "홍홍홍", "hong@test.com", "1111", "1111-1111"));
      System.out.println("변경개수 : " + cnt); 
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("데이터 처리중 오류가 발생했습니다.");
    }    
  }
}


