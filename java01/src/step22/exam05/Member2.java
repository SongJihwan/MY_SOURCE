package step22.exam05;

import java.io.Serializable;

public class Member2 implements Serializable {
  String name;
  int age;
  float height;
  float weight;
  transient float bmi;

  public Member2() {}

  public Member2(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public void caculateBMI() {
    bmi = weight / (float)Math.pow(height / 100, 2);
  }

  @Override
  public String toString() {
    return name + ", " + age + ", " + height + ", " + weight + ", " + bmi;
  }
}
