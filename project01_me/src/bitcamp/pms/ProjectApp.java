package bitcamp.pms;

import bitcamp.pms.controller.etc.WelcomeController;
import bitcamp.pms.dao.CommandMenuDAO;

public class ProjectApp {
  public static void main(String[] args) {
    WelcomeController.WelcomePrint();
    CommandMenuDAO.command();
  }
}
