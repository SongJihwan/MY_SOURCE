/*주제 : 컴파일과 실행, 자바 프로그램 기본구조*/

  //JVM이 제일 먼저 실행하는 명령어 블럭
  //만약, 없으면 실행 오류 발생!
  // => start Entry block(function, method)
  // => 문법
  // public static void main(String[] 변수명){}
  // static public void main(String[] 변수명){}
public class Exam01{
  public static void main(String[] args){
    System.out.println("Hello World!");
  }
}


/*컴파일
>javac -d [컴파일된 파일이 놓일 디렉토리명] [자바 소스 파일경로]
 예1) >javac src/Hello.java <== 자바 소스와 같은 디렉토리에 Hello.class가 생김
 예2) >javac -d bin src/Hello.java <== Hello.class파일이 bin 디렉토리에 생성됨
>java -cp
*/

/*실행
 >java -cp [클래스 파일이 있는 디렉토리] [클래스 이름(.class 확장자 제외)]
 예1) java Exam01
      <== 1) JRE Library($JAVA_HOME/jre/lib/*.jar)를 탐색
          2) 현재 작업 디렉토리를 탐색
 예2) java -classpath(cp) bin Exam01
      <== 1) JRE Library를 탐색
          2) -classpath에 설정된 디렉토리를 탐색
*/
