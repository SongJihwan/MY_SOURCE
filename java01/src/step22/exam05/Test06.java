// 주제: 대용량 데이터 읽기 - 버퍼링 데코레이터 사용 후
package step22.exam05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;

public class Test06 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("exam05.Test06.data");
    long start = System.currentTimeMillis();
    for (int i = 0; i < 5000000 ; i++) {
      fos.write(0x41);
    }
    long end = System.currentTimeMillis();

    fos.close();
    System.out.println(end - start);
  }
}
