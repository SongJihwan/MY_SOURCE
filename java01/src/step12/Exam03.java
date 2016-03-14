/* 주제: 인스턴스 변수에 접근 */
package step12;

public class Exam03 {
  int instanceValue = 1000;

  public void instanceMethod() {
    this.instanceValue = 2000;
  }

  static {
    // instance 주소가 있어야만 접근할 수 있다.
    // instanceValue = 3000; //error
    //static 블록은 인스턴스를 생성하기도 전에 실행되기 때문에
    //instance 주소를 가지고 있을 턱이 없다.
    // => this 변수가 존재하지도 않는다.
    //this.instanceValue = 3000; //error
  }

  // 스태틱 메서드는 인스턴스 주소 없이 호출할 수 있다.
  // 만약 인스턴스 주소 없이 호출하면 어떡할텐데?
  static void staticMethod() {
    // 그래서 스태틱 메서드는 this라는 변수가 없다.
    // this.instanceValue = 4000;
  }


  public static void main(String[] args) {
    Exam03.staticMethod();
    //instance 주소 없이는 instance 변수에 접근할 수 없다.
    // instanceValue = 5000; //error
    // 인스턴스 메서드는 인스턴스 주소 없이 호출할 수 없다.
    //Exam03.instanceMethod(); // 문법적으로 불가!
    Exam03 p = new Exam03();
    p.instanceValue = 6000; // OK!
    p.instanceMethod();
  }
}
