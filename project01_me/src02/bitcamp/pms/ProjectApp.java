package bitcamp.pms;

public class ProjectApp {
  public static void main(String[] args) {
    Welcome.WelcomePrint();
    int num = HowMany.people();
    String[] name = new String[num];
    name = Insert.memInfo(num);
    printMem.Print(num, name);
  }
}
