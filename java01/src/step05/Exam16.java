/*주제 : 중첩된 for문 나가기*/

package step05;

public class Exam16 {
  public static void main(String[] args) {
    for (int i = 2; i < 10; i++){
      for (int j = 1; j < 10; j++){
        System.out.printf("%d x %d = %d\t", i, j, i * j);
        if(i == 5 && j == 6)
        break;
      }
    }

    System.out.println("");
    ohmygod:{
    for (int i = 2; i < 10; i++){
      for (int j = 1; j < 10; j++){
        System.out.printf("%d x %d = %d\t", i, j, i * j);
        if(i == 5 && j == 6)
        break ohmygod;
      }
    }
    System.out.println("끝");
    }
  }
}
