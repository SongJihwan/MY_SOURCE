/* 퀴즈: 다음 값을 저장할 수 있는 변수를 선언하시오!
- 국어, 영어, 수학, 사회, 과학, 음악, 미술, 철학, 체육 점수를 저장할 변수
- 총점과 평균을 저장할 변수
- 조건: 같은 종류의 변수에 대해 가능한 배열을 사용하라!
*/

package step02;

import java.util.Scanner;

public class Quiz02{
  public static void main(String[] args){
    int[] score = new int[10];
    float avg;

    Scanner in = new Scanner(System.in);

    System.out.print("국어 점수? ");
    score[0] = in.nextInt();
    System.out.print("영어 점수? ");
    score[1] = in.nextInt();
    System.out.print("수학 점수? ");
    score[2] = in.nextInt();
    System.out.print("사회 점수? ");
    score[3] = in.nextInt();
    System.out.print("과학 점수? ");
    score[4] = in.nextInt();
    System.out.print("음악 점수? ");
    score[5] = in.nextInt();
    System.out.print("미술 점수? ");
    score[6] = in.nextInt();
    System.out.print("철학 점수? ");
    score[7] = in.nextInt();
    System.out.print("체육 점수? ");
    score[8] = in.nextInt();

    for(int i = 0; i < score.length-1; i++){
      score[9] += score[i];
    }

    avg = score[9] / 9;

    System.out.println("총점 : "+ score[9]);
    System.out.println("평균 : "+ avg);

  }
}
