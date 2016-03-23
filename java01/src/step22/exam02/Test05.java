// 주제: 바이트 읽기
package step22.exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test05 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("exam02.Test05.data");
    int b = fis.read();// 리턴 타입이 int이지만 1바이트 값을 읽어서 리턴한다.
    System.out.println(Integer.toHexString(b));
    b = fis.read();
    System.out.println(Integer.toHexString(b));
    b = fis.read();
    System.out.println(Integer.toHexString(b));
    b = fis.read();
    System.out.println(Integer.toHexString(b));
    b = fis.read();
    System.out.println(Integer.toHexString(b));

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    fis.close();
  }
}
