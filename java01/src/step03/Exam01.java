/*주제 : String 클래스 사용 - 문자열 저장*/

package step03;

public class Exam01{
  public static void main(String[] args){
      // 문자열 리터럴로 String 물건 만들기
      String s1 = "Hello"; //new String("Hello")와 같다.
      // new 명령을 사용하여 명시적으로 물건 만들기

      String s2 = new String("Hello");

      System.out.printf("%s %s\n", s1, s2);
  }
}
