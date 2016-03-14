package bitcamp.pms.controller.project;

import java.util.Scanner;
import java.sql.Date;
import bitcamp.pms.dao.ConfirmDAO;
import bitcamp.pms.domain.ProjectVO;

public class UpdateController {
  public static ProjectVO[] updateList(ProjectVO[] pro) {
    Scanner key = new Scanner(System.in);

    System.out.print("변경할 프로젝트번호? ");
    int index = key.nextInt();

    System.out.print("제목(" + pro[index].getTitle() + ")? ");
    String title = key.next();
    System.out.print("Start-Date(" + pro[index].getStartDate() + ")? ");
    Date startDate = Date.valueOf(key.next());
    System.out.print("End-Date(" + pro[index].getEndDate() + ")? ");
    Date endDate = Date.valueOf(key.next());
    System.out.print("설명(" + pro[index].getDescription() + ")? ");
    String description = key.next();


    if (ConfirmDAO.confirm("변경하시겠습니까?(y/n)", true)) {
      pro[index].setTitle(title);
      pro[index].setStartDate(startDate);
      pro[index].setEndDate(endDate);
      pro[index].setDescription(description);
    }

    return pro;
  }
}
