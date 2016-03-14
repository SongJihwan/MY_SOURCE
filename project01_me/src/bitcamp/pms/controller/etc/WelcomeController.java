package bitcamp.pms.controller.etc;

import bitcamp.pms.controller.etc.UnderLineController;

public class WelcomeController {
  public static void WelcomePrint() {
    System.out.println("PMS에 오신걸 환영합니다.");
    UnderLineController.draw();
  }
}
