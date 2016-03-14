package bitcamp.pms.controller.project;

import java.util.Scanner;
import java.sql.Date;
import bitcamp.pms.domain.ProjectVO;
import bitcamp.pms.dao.ConfirmDAO;
import bitcamp.pms.controller.project.ListAddController;

public class InsertController {

  public static ProjectVO[] proInsert() {

    Scanner key = new Scanner(System.in);

    System.out.println("프로젝트를 입력해주세요");
    System.out.print("제목? ");
    String title = key.next();
    System.out.print("Start-Date? ");
    Date startDate = Date.valueOf(key.next());
    System.out.print("End-Date? ");
    Date endDate = Date.valueOf(key.next());
    System.out.print("설명? ");
    String description = key.next();

    ProjectVO  pro = new ProjectVO();

    if (ConfirmDAO.confirm("저장하시겠습니까?(y/n)", true)) {
      pro.setTitle(title);
      pro.setStartDate(startDate);
      pro.setEndDate(endDate);
      pro.setDescription(description);
      System.out.println("저장하였습니다.");
    } else {
      System.out.println("저장하지 않았습니다.");
    }

    return ListAddController.addList(pro);
  }
}
