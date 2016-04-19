package designpattern.command.exam04;

public class MulCommand implements Command {
  @Override 
  public void execute(int a, int b) {
    System.out.println("a * b = " + (a * b));
  }  
}
