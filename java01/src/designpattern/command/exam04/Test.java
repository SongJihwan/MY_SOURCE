package designpattern.command.exam04;

import java.util.HashMap;

public class Test {
  static HashMap<String, Command> commandMap = new HashMap<>();
  static {
    commandMap.put("+", new PlusCommand());
    commandMap.put("-", new MinusCommand());
    commandMap.put("*", new MulCommand());
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    if (args.length < 3) {
      System.out.println("사용법 : java -cp bin ... Test 10 + 20");
      return ;
    }
    
    Command command = commandMap.get(args[1]);
    if (command == null) {
      System.out.println("지원하지 않는 연산자입니다.");
      return;
    }
    command.execute(Integer.parseInt(args[0]), Integer.parseInt(args[2]));
    
  }
}
