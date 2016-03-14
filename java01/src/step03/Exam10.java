/*주제 : String주요 도구 사용법4*/

package step03;

public class Exam10{
  public static void main(String[] args){
      String s1 = "ABCDEFGHIJKKLNKMOP";
      char c = s1.charAt(6);
      System.out.println(c);

      int  i = s1.indexOf('K'); // 첫 번째로 만난 문자의 index를 return 한다.
      System.out.println(i);

      i = s1.lastIndexOf('K'); // 뒤에서 부터 찾는다. 처음 만난 문자의 인덱스
      System.out.println(i);

      i = s1.indexOf("HIJ"); // 앞에서부터 찾는다.
      System.out.println(i);

      i = s1.lastIndexOf("HIJ"); //뒤에서부터 찾는다.
      System.out.println(i);

      String s2 = s1.substring(6); // 6번부터 끝까지 문자열 추출
      System.out.println(s2);

      s2 = s1.substring(6,10); // 6 <= index < 10
      System.out.println(s2);
  }
}
