/*퀴즈 : 다음값을 저장하고 지시에 따라 내용을 출력하시오.
-데이터
이름, 국어, 영어, 수학
홍길동 100   90    80
임꺽정  90   80    90
유관순  70  100   100

-출력
이름: 국어, 영어, 수학, 합계, 평균
*/

package step02;

public class Quiz04{
  public static void main(String[] args){
    String[] name = {"홍길동", "임꺽정", "유관순"};
    int[][] score = {
      {100, 90, 80, 100+90+80},
      {90, 80, 90, 90+80+90},
      {70, 100, 100, 70+100+100}
    };
    float[] avg = {(float)score[0][3]/3, (float)score[1][3]/3, (float)score[2][3]/3};

    System.out.printf("%s %d %d %d %d %.2f\n", name[0], score[0][0], score[0][1], score[0][2], score[0][3], avg[0]);
    System.out.printf("%s %d %d %d %d %.2f\n", name[1], score[1][0], score[1][1], score[2][2], score[1][3], avg[1]);
    System.out.printf("%s %d %d %d %d %.2f\n", name[2], score[2][0], score[2][1], score[1][2], score[2][3], avg[2]);

  }
}
