// 주제: 원시 타입 값을 읽기
package step22.exam04;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class Test08 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("exam04.Test06.data");

    MyDataInputStream in = new MyDataInputStream(fis);

    short no = in.readShort();
    int kor = in.readInt();
    int eng = in.readInt();
    int math = in.readInt();

    in.close();
    fis.close();

    System.out.println(no + ", " + kor + ", " + eng + ", " + math);
  }
}
