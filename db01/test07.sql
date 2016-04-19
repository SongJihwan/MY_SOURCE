drop table test;
create table test(
  tno int primary key,
  name char(5)
);
desc test;

drop table test;
create table test(
  tno int,
  name char(5),
  constraint test_pk primary key (tno)
);
desc test;

drop table test;
create table test(
  tno int,
  name char(5)
);
desc test;
alter table test add constraint test_pk primary key(tno);
alter table test add constraint test_uq unique(name);

drop table member;
drop table team;
create table member(
  mno int,
  name varchar(50),
  teamno int
);
alter table member add constraint member_pk primary key(mno);
alter table member modify name varchar(50) not null;
alter table member modify teamno int not null;
alter table member add constraint member_team_fk foreign key(teamno) references team(tno);

create table team(
  tno int,
  name varchar(50)
);
alter table team add constraint team_pk primary key(tno);
alter table team modify name varchar(50) not null;

insert into team values(100,"oh");
insert into team values(200,"woo");

insert into member values(1, '홍길동', 100);

delete from member where mno=1;
delete from team where tno=100;