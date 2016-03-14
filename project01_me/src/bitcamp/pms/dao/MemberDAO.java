package bitcamp.pms.dao;

import bitcamp.pms.domain.MemberVO;
import bitcamp.pms.controller.list.UpdateController;
import bitcamp.pms.controller.list.ListController;
import bitcamp.pms.controller.list.InsertController;
import bitcamp.pms.controller.list.DeleteController;
import java.util.Scanner;


public class MemberDAO {
  public static MemberVO[] mem = new MemberVO[200];

  public void addList() {
    mem = InsertController.memInsert();
  }

  public void deleteList() {
    mem = DeleteController.deleteList(mem);
  }

  public void updateList() {
    mem = UpdateController.updateList(mem);
  }

  public void printList() {
    ListController.printList(mem);
  }
}
