package step22.exam05;

import java.io.InputStream;
import java.io.IOException;

public class MyBufferedInputStream extends InputStream {
  byte[] buf = new byte[8192];
  int length;
  InputStream base;

  public MyBufferedInputStream(InputStream base) {
    this.base = base;
  }

  @Override
  public int read() throws IOException {
    if (length <= 0) {
      length = base.read(buf);
    }

    if (length != -1) {
      return buf[--length] & 0x000000ff;
    }

    return length;
  }
}
