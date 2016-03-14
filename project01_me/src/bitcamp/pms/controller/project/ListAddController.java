package bitcamp.pms.controller.project;

import bitcamp.pms.domain.ProjectVO;

public class ListAddController {
  public static ProjectVO[] project = new ProjectVO[200];

  public static ProjectVO[] addList(ProjectVO pro) {
    project[pro.getIndex()] = pro;
    return project;
  }
}
