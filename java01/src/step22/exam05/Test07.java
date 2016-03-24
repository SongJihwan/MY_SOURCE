// 주제: 대용량 데이터 읽기 - 버퍼링 데코레이터 사용 후
package step22.exam05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class Test07 {
  public static void main(String[] args) throws IOException {
    // FileOutputStream fos = new FileOutputStream("exam05.Test07.data");
    // BufferedOutputStream out = new BufferedOutputStream(fos);
    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("exam05.Test07.data"));
    long start = System.currentTimeMillis();
    for (int i = 0; i < 5000000 ; i++) {
      out.write(0x41);
    }
    long end = System.currentTimeMillis();

    // out.flush();
    out.close();
    // fos.close();
    System.out.println(end - start);
  }
}
