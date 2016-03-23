// 주제: 바이트 출력하기2
package step22.exam02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("exam02.Test02.data", true);

    int value = 0x2A3B4C5D;// 7_0852_9245(10진수)
    int cnt = ((int)Math.log10(value) / 2) - 1;
    while (cnt != 0) {
      fos.write(value >> 8 * cnt);// 비록 파라미터 타입이 int라 하더라도 맨 끝 1바이트만 출력.
      cnt--;
    }

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    fos.close();
  }
}
