/* 주제: 스태틱 변수에 접근 */
package step12;

public class Exam02 {
  static int staticValue;

  public void instanceMethod() {
    //static 변수는 클래스 이름으로 접근할 수 있다.
    Exam02.staticValue = 1000;

    //만약 Method가 static변수와 같은 클래스에 있다면
    //클래스명 생략가능
    staticValue = 2000;
  }

  static {
    Exam02.staticValue = 3000;
    staticValue = 4000;
  }

  public static void main(String[] args) {
    Exam02.staticValue = 5000;
    staticValue = 6000;
    System.out.println(staticValue);
  }
}


/*
스태틱 블록 실행 순서
1) 클래스 로딩
2) 스태틱 변수 준비
3) 스태틱 변수의 초기화 문장 실행
4) 스태틱 블록 실행


*/
