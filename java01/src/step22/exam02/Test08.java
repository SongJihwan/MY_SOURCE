// 주제: 바이트 읽기4
package step22.exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test08 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("exam02.Test05.data");
    byte[] buf = new byte[100];
    // 배열의 특정 방부터 읽어 들인 값을 채우고 싶을 사용한다.
    int length = fis.read(buf, 10, 3); // 10번 방부터 최대 3개를 읽어서 채워라.
    length = fis.read(buf, 10 + length, 5);
    for (int i = 0; i < 20; i++) {
      System.out.println(Integer.toHexString(buf[i]));
    }
    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    fis.close();
  }
}
