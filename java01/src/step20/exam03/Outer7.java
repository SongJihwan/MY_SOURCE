package step20.exam03;

public class Outer7 {
  int no;

  void m(){
    Object obj1 = new Object() {
      @Override
      public String toString() {
        return "오호라";
      }
    };

    System.out.println(obj1);
  }
}
