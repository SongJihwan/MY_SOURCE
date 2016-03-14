 /*주제 : 문자 변수 사용*/

package step02;

public class Exam04{
  public static void main(String[] args){
    char c1 = 0x41;
    char c2 = 0x0041;
    char c3 = '\u0041';
    char c4 = 'A';  // A 문자의 유니코드 값 저장
    char c5 = '가'; //가 문자의 유니코드 값 저장
    char c6 = 44032;
    // short s1 = '가'; //2 byte unsigned 값을 2byte signed 메모리에 저장할 수 없음

    System.out.println((int)c1);
    System.out.println((int)c2);
    System.out.println((int)c3);
    System.out.println((int)c4);
    System.out.println((int)c5);
    System.out.println(c6);
  }
}


/* println(변수)
- 변수의 데이터 타입이 char라면 코드 값을 출력하는 것이 아니라
  코드 값에 해당하는 폰트를 출력한다.
- 변수의 데이터 타입이 byte, short, int, long이라면 기본으로 10진수를 출력한다.
- 변수의 데이터 타입이 float, double이라면 기본을 부동소수점을 출력한다.
- 변수의 데이터 타입이 boolean이라면 true 또는 false 문자열로 출력한다.
 */
