// 주제: 대용량 데이터 읽기 - 버퍼링 데코레이터 사용 후
package step22.exam05;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.IOException;

public class Test05 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("test.pdf");
    BufferedInputStream in = new BufferedInputStream(fis);
    long start = System.currentTimeMillis();
    int b = 0;
    int cnt = 0;
    while ((b = in.read()) != -1) {
      if (cnt++ % 100000 == 0) {
        System.out.print(".");
      }
    }

    System.out.println();


    long end = System.currentTimeMillis();
    in.close();
    fis.close();
    System.out.println(end - start);
  }
}
