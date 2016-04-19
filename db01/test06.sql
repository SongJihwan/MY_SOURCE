drop table test;
create table test(
  tno int,
  name char(5)
);
desc test;

alter table test add column tel varchar(20);

alter table test modify column name varchar(50);

alter table test drop column tel;

alter table test modify column name varchar(50) not null;

alter table test change column name title;