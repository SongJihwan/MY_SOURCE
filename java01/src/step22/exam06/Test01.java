// 주제: 원시 타입 값을 출력하기 - Java에서 제공하는 데코레이터 사용하기
package step22.exam06;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileOutputStream;

public class Test01 {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("exam06.Test01.data");
    char c1 = '가';
    char c2 = 'A';
    fw.write(c1);
    fw.write(c2);
    fw.close();

    FileOutputStream fw2 = new FileOutputStream("exam06.Test01.data2");
    fw2.write(c1);
    fw2.write(c2);
    fw2.close();
  }
}
