package bitcamp.pms.controller.list;

import java.util.Scanner;
import bitcamp.pms.domain.MemberVO;
import bitcamp.pms.dao.ConfirmDAO;
import bitcamp.pms.controller.list.ListAddController;

public class InsertController {

  public static MemberVO[] memInsert() {

    Scanner key = new Scanner(System.in);

    System.out.println("회원정보를 입력해주세요");
    System.out.print("이름? ");
    String name = key.next();
    System.out.print("E-mail? ");
    String email = key.next();
    System.out.print("비밀번호? ");
    String pw = key.next();
    System.out.print("전화번호? ");
    String tel = key.next();

    MemberVO  mem = new MemberVO();

    if (ConfirmDAO.confirm("저장하시겠습니까?(y/n)", true)) {
      mem.setName(name);
      mem.setEmail(email);
      mem.setPw(pw);
      mem.setTel(tel);
      System.out.println("저장하였습니다.");
    } else {
      System.out.println("저장하지 않았습니다.");
    }

    return ListAddController.addList(mem);
  }
}
