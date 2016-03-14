/*주제 : String주요 도구 사용법5*/

package step03;

public class Exam11{
  public static void main(String[] args){
      String str = "비트캠프는 최고의 교육센터입니다.";

      boolean b = str.startsWith("비트"); //특정 문자열로 시작하는지 여부 판별
      System.out.println(b);

      b = str.endsWith("입니다");
      System.out.println(b);

      b = str.contains("교육");
      System.out.println(b);

      String[] arr = str.split(" ");
      //공백으로 쪼갠 문자열을 배열로 만들어 그 배열의 주소를 리턴
      //물건(Objedct)을 주고 받을 수는 없다.
      //오직 Primitive type(byte, short, int ,long, float, double, boolean, char)만
      //값을 주고 받을 수 있다.
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+", ");
      }
      System.out.println();
  }
}
