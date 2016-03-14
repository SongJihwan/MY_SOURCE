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

public class Quiz01{
  public static void main(String[] args){
    String str = new String("");
    int gens_cri = 0x800;
    int gens_dra = 0x400;
    int gens_com = 0x200;
    int gens_rom = 0x100;
    int gens_thr = 0x80;
    int gens_fam = 0x40;
    int gens_fan = 0x20;
    int gens_act = 0x10;
    int gens_sf = 0x8;
    int gens_ani = 0x4;
    int gens_doc = 0x2;
    int gens_ter = 0x1;
    int pre_movie_gens = 0x41A;

    if((pre_movie_gens & gens_cri) == gens_cri)
      str = str.concat("범죄 ");

    if((pre_movie_gens & gens_dra) == gens_dra)
      str = str.concat("드라마 ");

    if((pre_movie_gens & gens_com) == gens_com)
      str = str.concat("코미디 ");

    if((pre_movie_gens & gens_rom) == gens_rom)
      str = str.concat("로맨스 ");

    if((pre_movie_gens & gens_thr) == gens_thr)
      str = str.concat("스릴러 ");

    if((pre_movie_gens & gens_fam) == gens_fam)
      str = str.concat("가족 ");

    if((pre_movie_gens & gens_fan) == gens_fan)
      str = str.concat("판타지 ");

    if((pre_movie_gens & gens_act) == gens_act)
      str = str.concat("액션 ");

    if((pre_movie_gens & gens_sf) == gens_sf)
      str = str.concat("SF ");

    if((pre_movie_gens & gens_ani) == gens_ani)
      str = str.concat("애니메이션 ");

    if((pre_movie_gens & gens_doc) == gens_doc)
      str = str.concat("다큐멘터리 ");

    if((pre_movie_gens & gens_ter) == gens_ter)
      str = str.concat("공포 ");


    System.out.println("홍길동이 좋아하는 장르 : " + str.trim() );

  }
}
