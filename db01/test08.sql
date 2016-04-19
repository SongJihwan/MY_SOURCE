
drop table test;
create table test(
  tno int primary key auto_increment,
  name char(5)
);
desc test;

insert into test(name) values('hong1');
insert into test(name) values('hong2');
insert into test(name) values('hong3');

drop table test;
create table test(
  tno int,
  name char(5)
);
desc test;

alter table test add constraint test_pk primary key(tno);
alter table test modify tno int not null auto_increment;
