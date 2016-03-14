package bitcamp.pms.controller.list;

import java.util.Scanner;
import bitcamp.pms.dao.ConfirmDAO;
import bitcamp.pms.domain.MemberVO;

public class UpdateController {
  public static MemberVO[] updateList(MemberVO[] mem) {
    Scanner key = new Scanner(System.in);

    System.out.print("변경할 회원번호? ");
    int index = key.nextInt();

    System.out.print("이름(" + mem[index].getName() + ")? ");
    String name = key.next();
    System.out.print("E-mail(" + mem[index].getEmail() + ")? ");
    String email = key.next();
    System.out.print("비밀번호(" + mem[index].getPw() + ")? ");
    String pw = key.next();
    System.out.print("전화번호(" + mem[index].getTel() + ")? ");
    String tel = key.next();

    if (ConfirmDAO.confirm("변경하시겠습니까?(y/n)", true)) {
      mem[index].setName(name);
      mem[index].setEmail(email);
      mem[index].setPw(pw);
      mem[index].setTel(tel);
    }

    return mem;
  }
}
