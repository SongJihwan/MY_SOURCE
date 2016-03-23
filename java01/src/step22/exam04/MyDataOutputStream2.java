package step22.exam04;

import java.io.OutputStream;
import java.io.IOException;

public class MyDataOutputStream2 {
  static OutputStream fos;

  static void writeShort(short value) throws IOException {
    fos.write(value >> 8);
    fos.write(value);
  }

  static void writeint(int value) throws IOException {
    fos.write(value >> 24);
    fos.write(value >> 16);
    fos.write(value >> 8);
    fos.write(value);
  }


}
