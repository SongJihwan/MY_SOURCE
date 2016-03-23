// 주제: 바이트 출력하기4
package step22.exam02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("exam02.Test04.data", true);
    byte[] bytes = {0x2a, 0x3b, 0x4c, 0x5d, 0x6f, 0x7a};
    fos.write(bytes, 2, 3);
    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    fos.close();
  }
}
