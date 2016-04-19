create table test01 (
  tno int,
  name char(5)
);

insert into test01(tno, name) values(1,'hong');
insert into test01(tno, name) values(2,'park');
insert into test01(tno, name) values(3,'lee');
insert into test01(tno, name) values(4,'kim');
insert into test01(tno, name) values(5,'cho');
insert into test01(tno, name) values(6,'choi');


update test01 set name='you' where  tno=3;

delete from test01 where tno=3;