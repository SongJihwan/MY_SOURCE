 /*주제 : 배열에 값을 저장하고 꺼내기*/

package step02;

public class Exam07{
  public static void main(String[] args){
    int[] arr0;
    arr0 = new int[3];
    arr0[0] = 1;
    arr0[1] = 2;
    arr0[2] = 3;

    int[] arr1 = new int[3];
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;
    //arr[3] = 40;

    int[] arr2 = {100,200,300,400}; // 이 방식으로 배열을 초기화시킬 때는
                              // 배열 변수 선언문과 함께 사용해야 한다.

    int [] b;
    b = new int[]{10,20,30,40,50};

    int[] c;
    c = new int[]{10,200};

    // int[] d;
    // d = {100,200,300,400};

    System.out.println(arr1[2]);
    System.out.println(arr1.length);
    System.out.println(arr0[2]);
    System.out.println(arr2[3]);
    System.out.println(b[2]);
    System.out.println(c[1]);
    // System.out.println(d[2]);

  }
}


/* 배열 사용
- 배열에서 특정 항목의 변수를 사용하기
- 배열[인덱스] = 값;
  예) int[] a = new int[5];
      a[0] = 10;
      a[1] = 20;
      a[4] = 30;
      a[5] = 40; // 존재하지 않는 인덱스
- 인덱스는 배열의 항목을 가리키는 번호이다.
  0부터 시작한다.

 */
