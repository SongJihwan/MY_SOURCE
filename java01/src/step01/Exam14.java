/*주제 : 특수 문자의 표현*/
package step01;

public class Exam14{
  public static void main(String[] args){
      System.out.print("Hello");
      System.out.print('\b'); //return backspace code : 0x0008
      System.out.print("world!");
      System.out.print('\n'); //return linefeed(LF) code : 0x000a

      System.out.print('"'); //작은 따옴표 안에서 큰 따옴표 코드 : 0x0022
      System.out.print('\n');
      //System.out.print("This is "홍길동"");
      System.out.print("This is \"홍길동\"\n");

     System.out.println('\''); //작은 따옴표 코드 : 0x0027

     System.out.println('\\'); // backslash 코드 : 0x005c
    }
}


/* 이스케이프 문자
- \b : backspace
- \t : tab
- \n : linefeed(LF)
- \f : formfeed
- \r : carrage return(CR)
- \" : double quote
- \' : single quote
- \\ : backslash

줄바꿈?
- windows OS : 0D0A (2바이트로 표현)
- Unix/Linux : 0A (1바이트로 표현)


*/
