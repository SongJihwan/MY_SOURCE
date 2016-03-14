/* 문제 : 개인이 좋아하는 영화 장르를 저장하고 출력하는 프로그램을 작성하라.
=> 각 장르 선호 여부를 비트로 표현할 것.
=> 비트 연산자를 이용하여 검사할 것.
장르 : 범죄 드라마 코미디 로맨스 스릴러
       가족 판타지 액션 SF 애니메이션
       다큐멘터리 공포(12개)

- 테스트 데이터 -
홍길동이 좋아하는 장르 : 드라마, 액션, SF, 다큐멘터리
*/

package step04;

public class Quiz01up2{
  public static void main(String[] args){
    String str = new String("");
    int[] gens_mask = {0x800, 0x400, 0x200, 0x100, 0x80, 0x40, 0x20, 0x10, 0x8, 0x4, 0x2, 0x1};
    int pre_movie_gens = 0x41A;
    String[] gens = {"범죄", "드라마", "코미디", "로맨스", "스릴러", "가족", "판타지", "액션", "SF", "애니메이션", "다큐멘터리", "공포"};

    for(int i = 0; i < gens_mask.length; i++)
      if((pre_movie_gens & gens_mask[i]) == gens_mask[i])
        str = str.concat(gens[i]+" ");

    System.out.println("홍길동이 좋아하는 장르 : " + str.trim() );

  }
}
