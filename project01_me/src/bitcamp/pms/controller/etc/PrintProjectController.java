package bitcamp.pms.controller.etc;

import bitcamp.pms.domain.ProjectVO;

public class PrintProjectController {
  public static void showAll(ProjectVO[] pro, int length) {
    for (int i = 0; i < length; i++) {
      System.out.println((i + 1) + "번째 프로젝트정보 : " + pro[i]);
    }
  }
}
