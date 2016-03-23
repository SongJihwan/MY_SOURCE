// 주제: 원시 타입 값을 출력하기 - Refactoring(코드 개선) : 클래스 사용
package step22.exam04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Test03 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("exam04.Test03.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    MyDataOutputStream.writeShort(fos, no);
    MyDataOutputStream.writeint(fos, kor);
    MyDataOutputStream.writeint(fos, eng);
    MyDataOutputStream.writeint(fos, math);

    fos.close();
  }
}
