package bitcamp.pms.controller.etc;

import bitcamp.pms.domain.ProjectVO;

public class LengthProjectController {
  public static int arrLength(ProjectVO[] pro) {
    for (int i = 0; i < pro.length; i++) {
      if(pro[i] == null) {
        return i;
      }
    }
    return 0;
  }
}
