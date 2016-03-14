/*주제 : String주요 도구 사용법2, immutable object 개념*/

package step03;

public class Exam08{
  public static void main(String[] args){
    String s1 = "I will take a bus.";
    String s2 = s1.replace('l', 'x'); // 새 String 물건을 생성

    System.out.println(s1); // 절대 기존 내용물은 변경되지 않는다.
    System.out.println(s2);

    String s3 = s1.replace("bus", "taxi"); // 새 String 물건을 생성
    System.out.println(s3);
  }
}
