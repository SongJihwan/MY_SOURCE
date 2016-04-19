package step23.exam02;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends ArrayList<String> implements Hello {
  public HelloJp() {
    this.add("こんばんは");
    this.add("こんばんは");
  }

  @Override
  public String greet() {
    return this.sayHello();
  }

  public String sayHello() {
    if (Calendar.getInstance().get(Calendar.HOUR) < 18) {
      return list.get(0);
    } else {
      return list.get(1);
    }
  }
}
