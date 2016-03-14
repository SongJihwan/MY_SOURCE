/* 주제: call by reference */

package step08;

public class Exam09 {
  static void setValue(int[] arr) {
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;
  }

  public static void main(String[] args){
    int[] arr = new int[3];
    setValue(arr);
    for(int i : arr) {
      System.out.println(i);
    }
  }
}

/* call by reference
- 메서드를 호출할 때 파라미터으로 인스턴스 주소를 넘긴다.



*/
