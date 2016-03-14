package quiz;
/*
출처: codefights.com

숫자 배열이 있다.
나누어 0이 떨어지는 수가 몇 쌍이 있는지 구하라!

한 줄에 버그가 있다. 고쳐라!
*/
public class Test04{
  public static void main(String[] args){
    int[] values = {2, 4, 8};
    int cnt = 0;

    for(int i = 0; i < values.length - 1; i++){
      for(int j = i + 1; j < values.length; j++){
        if((values[j]) % values[i] == 0){
          cnt++;
        }
      }
    }
    System.out.println(cnt);

  }
}
