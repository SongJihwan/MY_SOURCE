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

public class Quiz01up1{
  public static void main(String[] args){
    String str = new String("");
    int[] gens_mask = {0x800, 0x400, 0x200, 0x100, 0x80, 0x40, 0x20, 0x10, 0x8, 0x4, 0x2, 0x1};
    int pre_movie_gens = 0x41A;

    
    if((pre_movie_gens & gens_mask[0]) == gens_mask[0])
      str = str.concat("범죄 ");

    if((pre_movie_gens & gens_mask[1]) == gens_mask[1])
      str = str.concat("드라마 ");

    if((pre_movie_gens & gens_mask[2]) == gens_mask[2])
      str = str.concat("코미디 ");

    if((pre_movie_gens & gens_mask[3]) == gens_mask[3])
      str = str.concat("로맨스 ");

    if((pre_movie_gens & gens_mask[4]) == gens_mask[4])
      str = str.concat("스릴러 ");

    if((pre_movie_gens & gens_mask[5]) == gens_mask[5])
      str = str.concat("가족 ");

    if((pre_movie_gens & gens_mask[6]) == gens_mask[6])
      str = str.concat("판타지 ");

    if((pre_movie_gens & gens_mask[7]) == gens_mask[7])
      str = str.concat("액션 ");

    if((pre_movie_gens & gens_mask[8]) == gens_mask[8])
      str = str.concat("SF ");

    if((pre_movie_gens & gens_mask[9]) == gens_mask[9])
      str = str.concat("애니메이션 ");

    if((pre_movie_gens & gens_mask[10]) == gens_mask[10])
      str = str.concat("다큐멘터리 ");

    if((pre_movie_gens & gens_mask[11]) == gens_mask[11])
      str = str.concat("공포 ");


    System.out.println("홍길동이 좋아하는 장르 : " + str.trim() );

  }
}
