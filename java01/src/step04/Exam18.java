/*주제 : 명시적 형변환과 암시적 형변환 함께 사용하기 */

package step04;

public class Exam18{
  public static void main(String[] args){
    int a = 5;
    int b = 2;
    float c = a / (float)b;
    System.out.println(c);

    int ch = 0xac00;
    System.out.println(ch);
    System.out.println((char)ch);
  }
}
