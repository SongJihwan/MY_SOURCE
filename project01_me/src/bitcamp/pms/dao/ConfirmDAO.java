package bitcamp.pms.dao;

import bitcamp.pms.controller.ask.ContinueAskController;
import bitcamp.pms.controller.ask.DeleteAskController;
import bitcamp.pms.controller.ask.SaveAskController;
import bitcamp.pms.controller.ask.UpdateAskController;

public class ConfirmDAO {
  public static boolean confirm(String message, boolean strictMode) {
    switch (message) {
    case "저장하시겠습니까?(y/n)":
      return SaveAskController.saveAsk(strictMode);

    case "계속하시겠습니까?(y/n)":
      return ContinueAskController.continueAsk(strictMode);

    case "변경하시겠습니까?(y/n)":
      return UpdateAskController.updateAsk(strictMode);

    case "삭제하시겠습니까?(y/n)":
      return DeleteAskController.deleteAsk(strictMode);
    }

    return false;
  }
}
