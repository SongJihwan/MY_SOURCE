package step29.exam02;

public class MemberDelete {

  public static void main(String[] args) throws Exception {
    try {
      MemberDao memberDao = new MemberDao();
      int cnt = memberDao.delete(7);
      System.out.println("삭제개수 : " + cnt);
    } catch(Exception e) {
      System.out.println("데이터 처리중 오류가 발생했습니다.");
    }
    
  }
}


