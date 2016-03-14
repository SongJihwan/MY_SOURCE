package bitcamp.pms.dao;

import bitcamp.pms.domain.ProjectVO;
import bitcamp.pms.controller.project.UpdateController;
import bitcamp.pms.controller.project.ListController;
import bitcamp.pms.controller.project.InsertController;
import bitcamp.pms.controller.project.DeleteController;
import java.util.Scanner;


public class ProjectDAO {
  public static ProjectVO[] pro = new ProjectVO[200];

  public void addList() {
    pro = InsertController.proInsert();
  }

  public void deleteList() {
    pro = DeleteController.deleteList(pro);
  }

  public void updateList() {
    pro = UpdateController.updateList(pro);
  }

  public void printList() {
    ListController.printList(pro);
  }
}
