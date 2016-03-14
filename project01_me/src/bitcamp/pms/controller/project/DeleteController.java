package bitcamp.pms.controller.project;

import java.util.Scanner;
import bitcamp.pms.domain.ProjectVO;
import bitcamp.pms.dao.ProjectDAO;
import bitcamp.pms.dao.ConfirmDAO;
import bitcamp.pms.controller.etc.LengthProjectController;

public class DeleteController {
  public static ProjectVO[] deleteList(ProjectVO[] pro) {
    Scanner key = new Scanner(System.in);

    System.out.print("삭제할 프로젝트번호? ");
    int index = key.nextInt();

    int length = LengthProjectController.arrLength(pro);

    if (ConfirmDAO.confirm("삭제하시겠습니까?(y/n)", true)) {
      for (int i = index; i < length - 1; i++) {
        pro[i] = pro[i + 1];
        pro[i].setIndex(i);
      }
      pro[length - 1].indexMinus();
      pro[length - 1] = null;
    }

    return pro;
  }
}
