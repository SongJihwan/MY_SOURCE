// 주제: 대용량 데이터 읽기 - 버퍼링 데코레이터 사용 후
package step22.exam05;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;

public class Test10 {
  public static void main(String[] args) throws IOException {
    try {
      Member2 m1 = new Member2("홍길동", 20, 183, 66);
      Member2 m2 = new Member2("임꺽정", 45, 178, 98);

      ObjectOutputStream out1 = new ObjectOutputStream(
      new BufferedOutputStream(
      new FileOutputStream("exam05.Test10.data")));

      out1.writeObject(m1);
      out1.writeObject(m2);

      out1.close();
    } catch (NotSerializableException e) {
      System.out.println("error");
    }
  }
}
