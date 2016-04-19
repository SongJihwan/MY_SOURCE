package designpattern.abstractfactory.exam01;

import java.util.Scanner;

public class Game {
  Scanner key = new Scanner(System.in);
  int selectedRace;
  Home home;
  
  public void service() throws Exception {
    selectRace();

    String command = null;
    while (true) {
      System.out.print("명령> ");
      command = key.nextLine();
      if (command.equals("quit")) {
        System.out.println("게임종료!");
        return;
      }

      if (!command.equals("home")) {
        System.out.println("유효하지 않은 명령어입니다.");
        continue;
      }

      doHome();
    }
  }

  private void doHome() {
    if (selectedRace == 1) {
      HumanHomeFactory factory = new HumanHomeFactory();
      home = factory.createHome();
    } else if (selectedRace == 2) {
      AlienHomeFactory factory = new AlienHomeFactory();
      home = factory.createHome();
    } else {
      MonsterHomeFactory factory = new MonsterHomeFactory();
      home = factory.createHome();
    }
    System.out.println("집짓기 완료!");
    System.out.print("[집정보] --> ");
    System.out.println(home);
  }

  private void selectRace() {
    System.out.println("1)인간족 2)외계족 3)괴물족");
    System.out.print("종족을 선택하시오 ");
    selectedRace = Integer.parseInt(key.nextLine());
  }

  public static void main(String[] args) throws Exception {
    Game game = new Game();
    game.service();
  }

}
