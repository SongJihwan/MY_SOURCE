package step22.exam04;

import java.io.OutputStream;
import java.io.IOException;

public class MyDataOutputStream3 {
  OutputStream fos;

  // 생성자의 존재 이유?
  // => 객체를 사용하는 필요한 최소한의 준비를 시키는 메서드
  public MyDataOutputStream3(OutputStream fos) {
    this.fos = fos;
  }

  public void writeShort(short value) throws IOException {
    fos.write(value >> 8);
    fos.write(value);
  }

  public void writeint(int value) throws IOException {
    fos.write(value >> 24);
    fos.write(value >> 16);
    fos.write(value >> 8);
    fos.write(value);
  }


}
