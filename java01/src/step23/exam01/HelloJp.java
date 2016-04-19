package step23.exam01;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends Hello {
  ArrayList<String> list = new ArrayList<>();

  public HelloJp() {
    list.add("こんばんは");
    list.add("こんばんは");
  }

  public String sayHello() {
    if (Calendar.getInstance().get(Calendar.HOUR) < 18) {
      return list.get(0);
    } else {
      return list.get(1);
    }
  }
}
