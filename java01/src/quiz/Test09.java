package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Given first two elements of an arithmetic progression, find its n-th element.
[input] integer element1
1st element of the arithmetic progression
[input] integer element2
2nd element of the arithmetic progression
[input] integer n
positive integer
[output] integer
n-th element of the arithmetic progression
 */
public class Test09{
  public static void main(String[] args){
    int[] a= {2, 5, 5};
    int com = a[1] - a[0];
    int i = a[2];
    int value = a[0] - com;
    while(i != 0){
      value += com;
      i--;
    }
    System.out.println(value);
  }
}
