package step17;

public class Quiz {
  public static void main(String[] args) {
    int num = HowMany.howManyPeople();
    QuizMember[] mem = new QuizMember[num];
    mem = Insert.memInsert(num);
    Show.showAll(mem, num);
  }
}
