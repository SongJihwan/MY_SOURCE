package step22.exam04;

import java.io.OutputStream;
import java.io.IOException;

public class MyDataOutputStream {
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


}
