// 주제: 원시 타입 값을 출력하기
package step22.exam04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("exam04.Test01.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    fos.write(no >> 24);
    fos.write(no >> 16);
    fos.write(no >> 8);
    fos.write(no);

    fos.write(kor >> 24);
    fos.write(kor >> 16);
    fos.write(kor >> 8);
    fos.write(kor);

    fos.write(eng >> 24);
    fos.write(eng >> 16);
    fos.write(eng >> 8);
    fos.write(eng);

    fos.write(math >> 24);
    fos.write(math >> 16);
    fos.write(math >> 8);
    fos.write(math);

    fos.close();
  }
}
