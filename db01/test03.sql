drop table test;
create table test(
  tno int primary key,
  name varchar(20) not null,
  email varchar(10) unique not null,
  intro varchar(21813)
);
desc test;

insert into test values(1,'hong');
insert into test values(1,'park');
insert into test values(3,'lee');
insert into test values(4,'kim');
insert into test values(5,'cho');
insert into test values(6,'choi');
insert into test(tno) values(7);
insert into test(name) values('홍길동');

update test set name='you' where  tno=3;

delete from test where tno=3;

insert into test(tno,name) values(1, '홍길동');
insert into test(tno,name) values(2, '임꺽정');
insert into test(name,email) values('이순신','lee@');
insert into test(name,email) values('강감찬','kang@');
insert into test(tno,name) values(2, '임꺽정');
insert into test(name,email) values('임꺽정','leem@');
insert into test(name,email) values('강감찬','kang@');
insert into test(tno,name) values(3, '강감찬');
insert into test(name) values('강감찬');
insert into test(name) values('강감찬');
insert into test(name) values('강감찬');
insert into test(tno,name,email) values(3, '이순정', 'lee@');

drop table test;
create table test(
  tno int primary key,
  name varchar(20) not null,
  email varchar(10) unique not null,
  intro text,
  cre_dt date,
  upd_dt datetime
);
desc test;

insert into test(tno,name,email,cre_dt,upd_dt) value(4,'aaa4','aaa4','2016-2-2 12:17:02','2016-2-2 12:17:02');