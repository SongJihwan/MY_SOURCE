/*주제 : 비트 연산자 사용*/

package step04;

public class Exam05{
  public static void main(String[] args){
    // &(AND) => 특정 비트들을 걸러내는 효과가 있다
    int a = 0b0101_0011;
    int b = 0b0000_1111;
    String result = Integer.toBinaryString(a & b);
    System.out.println(result);

    // |(OR) => 특정 비트의 값을 강화하는 효과가 있다
    result = Integer.toBinaryString(a | b);
    System.out.println(result);

    //  ~(NOT) => 전체 비트의 값을 반전시키는 효과가 있음
    result = Integer.toBinaryString(~a);
    System.out.println(result);

    // ^(XOR) => 특정 비트의 값을 제거하는 것
                // 영상 크로마킹 기법에 많이 사용한다
    b = 0b0000_1111;
    result = Integer.toBinaryString(a ^ b);
    System.out.println(result);
  }
}
