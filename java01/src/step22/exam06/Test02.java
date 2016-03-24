// 주제: 원시 타입 값을 출력하기 - Java에서 제공하는 데코레이터 사용하기
package step22.exam06;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileInputStream;

public class Test02 {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("exam06.Test01.data");
    int c;
    while ((c = fr.read()) != -1) {
      System.out.println(Integer.toHexString(c));
    }
    fr.close();
    System.out.println("--------------------------------");
    FileInputStream fr2 = new FileInputStream("exam06.Test01.data");
    while ((c = fr2.read()) != -1) {
      System.out.println(Integer.toHexString(c));
    }
    fr2.close();
  }
}
