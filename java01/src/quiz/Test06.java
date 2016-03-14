package quiz;
// 출처: codefights.com
// 한 줄에 버그가 있다. 고쳐라!
/*
A geometric progression is a sequence of numbers
where each term after the first is found
by multiplying the previous one by a fixed, non-zero number.
Example
isGeometricProgression([1, 4, 16]) = true
isGeometricProgression([2, 4, 8, 17, 34]) = false
[input] array.integer sequence
array of integers
[output] boolean
true if sequence represents a geometric progression,
*/

public class Test06{
  public static void main(String[] args){
    int[][] test = {{1,4,16}, {2,4,8,17,34}};
    boolean b = true;
    int com = test[0][1] / test[0][0];

    for (int i = 0; i < test.length; i++) {
      for(int j = 2; j < test[i].length; j++) {
        if(Math.pow(com, j) == test[i][j]) {
          b = true;
        } else {
          b = false;
        }
      }
      System.out.println(b);
    }


  }
}
