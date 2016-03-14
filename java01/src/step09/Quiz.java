package step09;

public class Quiz {
  static int testFraction(int n[], int d[]) {
    int max_index = 0;
    for (int i = 1; i < n.length; i ++) {
      if (n[max_index] * d[i] < n[i] * d[max_index]) {
      // if ((float)n[max_index] / d[max_index] < (float)n[i] / d[i]) {
        max_index = i;
      }
    }
    return max_index;
  }

  public static void main(String[] args) {
    int index = testFraction(new int[]{5, 2, 5}, new int[]{6, 3, 4});
    System.out.println(index);
  }
}
