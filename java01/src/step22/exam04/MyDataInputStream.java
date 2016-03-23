package step22.exam04;

import java.io.InputStream;
import java.io.IOException;

public class MyDataInputStream extends InputStream {
  InputStream base;

  public MyDataInputStream(InputStream base) {
    this.base = base;
  }

  @Override
  public int read() throws IOException {
    return base.read();
  }

  @Override
  public int read(byte[] bytes) throws IOException {
    return base.read(bytes);
  }

  @Override
  public int read(byte[] bytes, int offset, int len) throws IOException {
    return base.read(bytes, offset, len);
  }

  public short readShort() throws IOException {
    int result = 0;
    int temp = 0;

    for (int i = 0; i < 2; i++) {
      temp = this.read();
      result += (temp << 8 * (1 - i));
    }

    return (short)result;
  }

  public int readInt() throws IOException {
    int result = 0;
    int temp = 0;

    for (int i = 0; i < 4; i++) {
      temp = this.read();
      result += (temp << 8 * (3 - i));
    }

    return result;
  }
}
