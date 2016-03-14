package bitcamp.pms.controller.list;

import java.util.Scanner;
import bitcamp.pms.domain.MemberVO;
import bitcamp.pms.dao.MemberDAO;
import bitcamp.pms.dao.ConfirmDAO;
import bitcamp.pms.controller.etc.LengthController;

public class DeleteController {
  public static MemberVO[] deleteList(MemberVO[] mem) {
    Scanner key = new Scanner(System.in);

    System.out.print("삭제할 회원번호? ");
    int index = key.nextInt();

    int length = LengthController.arrLength(mem);

    if (ConfirmDAO.confirm("삭제하시겠습니까?(y/n)", true)) {
      for (int i = index; i < length - 1; i++) {
        mem[i] = mem[i + 1];
        mem[i].setIndex(i);
      }
      mem[length - 1].indexMinus();
      mem[length - 1] = null;
    }

    return mem;
  }
}
