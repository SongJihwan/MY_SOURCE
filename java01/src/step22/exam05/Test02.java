// 주제: 원시 타입 값을 읽기 - Java에서 제공하는 데코레이터 사용하기
package step22.exam05;

import java.io.File;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Test02 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("exam04.Test06.data");
    DataInputStream in = new DataInputStream(fis);

    short no = in.readShort();
    int kor = in.readInt();
    int eng = in.readInt();
    int math = in.readInt();

    in.close();
    fis.close();

    System.out.println(no + ", " + kor + ", " + eng + ", " + math);
  }
}
