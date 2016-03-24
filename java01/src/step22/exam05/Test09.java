// 주제: 대용량 데이터 읽기 - 버퍼링 데코레이터 사용 후
package step22.exam05;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Test09 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("exam05.Test08.data");
    BufferedInputStream in = new BufferedInputStream(fis);
    DataInputStream in1 = new DataInputStream(in);

    Member m1 = new Member(in1.readUTF(), in1.readInt(), in1.readInt(), in1.readInt());
    Member m2 = new Member(in1.readUTF(), in1.readInt(), in1.readInt(), in1.readInt());

    System.out.println(m1);
    System.out.println(m2);

    in1.close();
    in.close();
    fis.close();
  }
}
