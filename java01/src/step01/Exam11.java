/*주제 : 실수 값 표현*/
package step01;

public class Exam11{
  public static void main(String[] args){
    System.out.println(3.14f); //4바이트 실수값

    //소수점을 뗀 정수 값이 8자리인 경우
    System.out.println(1500.1254f); //4바이트 실수값 OK
    System.out.println(15.001254f); //4바이트 실수값 OK
    System.out.println(150012.54f); //4바이트 실수값 NO


    System.out.println(2200.1254f); //4바이트 실수값 NO
    System.out.println(22.001254f); //4바이트 실수값 NO
    System.out.println(220012.54f); //4바이트 실수값 NO

    //결론? 32비트 메모리에 부동소수점을 저장할 때는 가능한 7자리 숫자를 저장하라.

    System.out.println(850.1254f); //4바이트 실수값 OK
    System.out.println(85.01254f); //4바이트 실수값 OK
    System.out.println(85012.54f); //4바이트 실수값 NO
    // 32비트 메모리 크기 보다 더 큰 값을 넣을 때?
      // - 유효자릿수를 넘겨도 컴파일 오류가 발생하지 않는다.
      // - 다만 짤릴 뿐이다.
    System.out.println(3456789.2345f); // 유효자릿수를 벗어나기 때문에 짤린다.
    System.out.println(3456789.2345); // 64비트 부동소수점을 의미.
                                        // 값이 짤리지 않는다.

    // 32비트 정수에 아무것도 붙이지 않는다. => 정수는 32비트를 주로 사용한다.
    // 64비트 부동소수점에 아무것도 붙이지 않는다.
    //   => 부동소수점은 64비트를 주로 사용한다.
    }
  }

  /* 실수 값 => 부동소수점
  - 제곱승으로 표현하면 소수점의 위치가 바뀔 수 있다.
  예) 3.14 = 31.4 * 10^-1 = 314 * 10^-2 = 0.314 * 10^1

  부동소수점을 메모리에 저장하는 방법?
  - 2진수로 표현할 수 있어야 한다.
  - 그래야만 전기적인 신호로 구현할 수 있다.
  - 결론 => 부동소수점을 2진수로 변환할 수만 있다면 메모리에 저장 가능!
  - IEEE 754 명세에 부동소수점을 2진수로 변환하는 방법이 기술되어 있다.
    현대의 대부분의 컴퓨터는 이 명세에 따라서 부동소수점을 다룬다.
  - 간략한 설명(실제는 좀 더 복잡하다)
  예) 3.14 = 314 * 10^-2
  [24비트(정수값을 저장) = 가수부][8비트(지수값 저장) = 지수부] = 32비트
  [0000 0000 0000 0001 0011 1010][1111 1110]

  - 가수부(정수를 저장하는 영역)의 크기가 24비트이므로,
    최대 1600만 정도의 정수 값을 저장할 수 있다.
  - 만약 1600만이 넘어 간다면 나머지 값은 짤린다.
    올바르지 않는 수가 된다.
  - 개발자가 부동소수점을 사용할 때는 대략 다음의 기준을 삼으면 된다.
    부동소수점에서 소수점을 뗀 정수 값이 1600만을 넘지 않으면
    올바르게 메모리에 저장할 수 있다.

  32비트 메모리에 부동소수점을 저장할 때, 결론?
  - 소수점을 뺀 정수 값이 8자리인 경우 어떤 수(약 1600만 이하)는 제대로 저장되고,
    어떤 수는 제대로 저장되지 않는다.
  - 안전한 보관을 위해서는 7자리 부동소수점을 저장하도록 하라!
  - 이렇게 안전하게 저장할 수 있는 부동소수점의 자릿수를
    "유효자릿수"라고 부른다.

  64비트 메모리에 저장할 수 있는 유효자릿수는?
  - IEEE 754 명세서
    [가수부(53비트)][지수부(11비트)]
  - 2^53 의 값(9,007,199,254,740,992)을 저장할 수 있다.
  - 최대 16자리 중에서 15자리 수를 저장하는 것이 안전하다.
  - 유효자릿수 = 15자리

  32비트 유효자릿수 7자리, 64비트 유효자릿수 15자리!
  - 32비트보다 64비트 메모리가 두배 큰(더 정밀한) 값을 저장할 수 있다.
  - 64비트는 두배 정밀하다 => 배정도(double-precision)
  - 32비트는 기준이 되는 정밀도 => 단정도(single-precision)

  용어정리!
  32비트 부동소수점 => 유효자릿수 7자리 => 단정도(single-precision) => float
  64비트 부동소수점 => 유효자릿수 15자리 => 배정도(double-precision) => double





  */
