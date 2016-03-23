// 주제: 원시 타입 값을 출력하기 - Refactoring(코드 개선) : 메서드 사용
package step22.exam04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Test02 {
  static void writeShort(OutputStream fos, short value) throws IOException {
    fos.write(value >> 8);
    fos.write(value);
  }

  static void writeint(OutputStream fos, int value) throws IOException {
    fos.write(value >> 24);
    fos.write(value >> 16);
    fos.write(value >> 8);
    fos.write(value);
  }

  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("exam04.Test02.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    writeShort(fos, no);
    writeint(fos, kor);
    writeint(fos, eng);
    writeint(fos, math);

    fos.close();
  }
}
