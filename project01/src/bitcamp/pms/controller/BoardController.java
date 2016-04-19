package bitcamp.pms.controller;

import java.util.List;
import java.util.Scanner;

import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.dao.BoardDao;
import bitcamp.pms.domain.Board;
import bitcamp.pms.util.CommandUtil;

//목록 --> 제목 조회수 생성일
//추가 --> 제목 내용 암호
//변경 --> 제목 내용 암호
//삭제 --> 인덱스로 삭제할 게시물 지

@Controller
@RequestMapping("board/")
public class BoardController {
  private BoardDao boardDao;

  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @RequestMapping("add.do")
  public void add(Scanner keyScan) {
    Board board = new Board();

    System.out.print("제목? ");
    board.setTitle(keyScan.nextLine());
    System.out.print("내용? ");
    board.setContent(keyScan.nextLine());
    board.setViews(0);
    System.out.print("비밀번호? ");
    board.setPw(keyScan.nextLine());

    if (CommandUtil.confirm("저장하시겠습니까?", keyScan)) {
      try {
        if (boardDao.insert(board) > 0) {
          System.out.println("저장하였습니다.");
        } else {
          System.out.println("유효하지 않은 번호이거나, 이미 삭제된 항목입니다.");
        }
      } catch (Exception e) {
        System.out.println("데이터 저장에 실패했습니다.");
      }
    } else {
      System.out.println("저장을 취소하였습니다.");
    }
  }

  @RequestMapping("delete.do")
  public void delete(Scanner keyScan) {
    try {
      System.out.print("삭제할 게시물 번호?");
      int no = Integer.parseInt(keyScan.nextLine());

      if (CommandUtil.confirm("정말 삭제하시겠습니까?", keyScan)) {
        if (boardDao.delete(no) > 0) {
          System.out.println("삭제하였습니다.");
        } else {
          System.out.println("유효하지 않은 번호이거나, 이미 삭제된 항목입니다.");
        }
      } else {
        System.out.println("삭제를 취소하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("데이터 처리에 실패했습니다.");
    }
  }

  @RequestMapping("list.do")
  public void list() {
    try {
      List<Board> list = boardDao.selectList();

      for (Board board : list) {
        System.out.println(board);
      }
    } catch (Exception e) {
      throw new RuntimeException("게시판정보 로딩 실패");
    }
  }

  @RequestMapping("update.do")
  public void update(Scanner keyScan) {

    try {
      System.out.print("변경할 게시물 번호?");
      int no = Integer.parseInt(keyScan.nextLine());
      Board board = boardDao.selectOne(no);
      
      if (board == null) {
        System.out.println("유효하지 않은 번호입니다.");
        return;
      }

      System.out.print("제목(" + board.getTitle() + ")? ");
      board.setTitle(keyScan.nextLine());
      System.out.print("내용(" + board.getContent() + ")? ");
      board.setContent(keyScan.nextLine());

      if (CommandUtil.confirm("변경하시겠습니까?", keyScan)) {
        if (boardDao.update(board) > 0) {
          System.out.println("변경하였습니다.");
        } else {
          System.out.println("유효하지 않은 번호이거나, 이미 삭제된 항목입니다.");
        }
      } else {
        System.out.println("변경을 취소하였습니다.");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("데이터 처리에 실패했습니다.");
    }

  }

}
