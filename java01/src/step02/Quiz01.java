/* 퀴즈 : 다음 값을 저장할 수 있는 변수를 선언하시오
 - 국어 ,영어, 수학 점수와 총점, 평균값을 저장
 - 재직여부*/

package step02;

import java.util.Scanner;

public class Quiz01{
  public static void main(String[] args){
    boolean working = true;

    Scanner s = new Scanner(System.in);

    System.out.print("국어 점수? ");
    int kor = s.nextInt();
    System.out.print("영어 점수? ");
    int eng = s.nextInt();
    System.out.print("수학 점수? ");
    int math = s.nextInt();
    System.out.print("성별?(m/f) ");
    String sex = s.next();
    System.out.print("재직 중이십니까?(y/n) ");
    String check = s.next();
    if(check == "y"){
      working = true;
    }else if(check == "n"){
      working = false;
    }
    int sum = kor + eng + math;
    float avg = sum / 3;

    System.out.println("국어 : " + kor + " 영어 : " + eng + " 수학 : " + math);
    System.out.println("평균 : " + avg + "\n총점 : " + sum);
    if(sex.equals("m")){
      System.out.println("성별은 남자입니다.");
    } else if(sex.equals("f")){
      System.out.println("성별은 여자입니다.");
    } else{
      System.out.println("성별을 잘못입력했습니다.");
    }
    if(working == true){
      System.out.println("재직중입니다.");
    }else if(working == false){
      System.out.println("실업중입니다.");
    }else{
      System.out.println("재직 상태를 잘못입력하셨습니다.");
    }
  }
}
