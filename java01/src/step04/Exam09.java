/*주제 : 전위 증가/감소 연산자 */

package step04;

public class Exam09{
  public static void main(String[] args){
    int i = 10;
    System.out.println(i);
    i = i + 1;
    System.out.println(i);
    i += 1;
    System.out.println(i);
    ++i; //prefix 증가 연산자
    System.out.println(i);
    ++i;
    System.out.println(i);
    ++i;
    System.out.println(i);
    System.out.println();

    int j = 10;
    System.out.println(j);
    j = j - 1;
    System.out.println(j);
    j -= 1;
    System.out.println(j);
    --j; //prefix 감소 연산자
    System.out.println(j);
    --j;
    System.out.println(j);
    --j;
    System.out.println(j);

    i = 10;
    j = 10;

    System.out.println();
    System.out.printf("%d %d\n", ++i, --j);

  }
}
