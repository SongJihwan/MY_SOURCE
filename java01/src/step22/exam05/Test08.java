// 주제: 대용량 데이터 읽기 - 버퍼링 데코레이터 사용 후
package step22.exam05;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Test08 {
  public static void main(String[] args) throws IOException {
    Member m1 = new Member("홍길동", 20, 180, 70);
    Member m2 = new Member("임꺽정", 45, 178, 98);

    FileOutputStream fos = new FileOutputStream("exam05.Test08.data");
    BufferedOutputStream out = new BufferedOutputStream(fos);
    DataOutputStream out1 = new DataOutputStream(out);

    out1.writeUTF(m1.name);
    out1.writeInt(m1.age);
    out1.writeInt(m1.height);
    out1.writeInt(m1.weight);

    out1.writeUTF(m2.name);
    out1.writeInt(m2.age);
    out1.writeInt(m2.height);
    out1.writeInt(m2.weight);

    // out.flush();
    out1.close();
    out.close();
    fos.close();
  }
}
