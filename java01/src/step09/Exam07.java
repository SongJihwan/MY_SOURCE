/* 주제: 인스턴스 데이터를 다루는 연산자(operator) 추가하기 */

package step09;

public class Exam07 {
  static class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float avg;

    Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }

    // 사용자 정의 연산자 추가하기
    void sum() { // 국,영,수 합계를 계산하는 연산자
      this.sum = this.kor + this.eng + this.math;
    }

    void avg() {
      this.avg = this.sum / 3f;
    }
  }

  public static void main(String[] args){
    Score[] s = new Score[]{
      new Score("홍길동", 100, 100, 100),
      new Score("임꺽정", 90, 90, 90),
      new Score("유관순", 80, 80, 80)
    };

    for (int i = 0; i < s.length; i++) {
      // 메서드를 실행하는 것은
    // 인스턴스에 대해 연산자를 실행하는 것과 같다.
      s[i].sum();//s 데이터에 대해 sum() 연산을 수행한다.
      s[i].avg();//s 데이터에 대해 avg() 연산을 수행한다.
      System.out.println(s[i].name + " " + s[i].kor + " " +
      s[i].eng + " " + s[i].math + " " + s[i].sum + " " + s[i].avg);
    }
  }
}

/* 메서드?
- 특정 기능을 수행하는 명령어를 묶어 둔 것.
- 사용자가 정의한 타입(클래스)의 데이터를 다루는 연산자를 정의할 때
  메서드 문법을 사용한다. --> method == operator
- 메서드 실행은 물건에게 명령을 내리기 위해
  메시지를 전달하는 것과 같다. --> method == message


*/
