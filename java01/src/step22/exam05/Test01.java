// 주제: 원시 타입 값을 출력하기 - Java에서 제공하는 데코레이터 사용하기
package step22.exam05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Test01 {
  public static void main(String[] args) throws IOException {
    // 실제 작업을 수행할 객체를 준비한다.
    FileOutputStream fos = new FileOutputStream("exam05.Test01.data");
    // FileOutputStream에 데코레이터를 붙인다.
    // => 원시 타입을 바이트로 쪼개서 출력하는 기능을 갖고 있다.
    // => 이런 데코레이터 클래스를 "Data Processing Stream Class"라 부른다.
    DataOutputStream fos2 = new DataOutputStream(fos);

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    fos2.writeShort(no);
    fos2.writeInt(kor);
    fos2.writeInt(eng);
    fos2.writeInt(math);

    // 자원을 해제할 때 맨 마지막에 연결된 객체부터 해제하라!
    fos2.close();
    fos.close();
  }
}
