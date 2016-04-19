drop table test;
create table test(
  tno int primary key,
  email varchar(10) unique not null,
  fst_nm varchar(20),
  lst_nm varchar(20),
  age int,
  cre_dt date
);
desc test;


insert into test values(1,'aaa','aaa','aaa',18,now());
insert into test values(2,'bbb','bbb','bbb',19,curdate());
insert into test values(3,'ccc','ccc','ccc',18,'2016-2-1');
insert into test values(4,'ddd','ddd','ddd',18,'2016-3-15');
insert into test values(5,'eee','eee','eee',18,'2016-3-29');
insert into test values(6,'fff','fff','fff',19,'2016-4-2');
insert into test values(7,'ggg','ggg','ggg',19,'2016-4-16');
insert into test values(8,'hhh','hhh','hhh',19,'2016-4-27');
insert into test values(9,'iii','iii','iii',19,'2016-5-3');
insert into test values(10,'jjj','jjj','jjj',19,'2016-5-17');
insert into test values(11,'kkk',null,'kkk',19,'2016-5-17');
insert into test values(12,'lll','lll',null,19,'2016-5-17');
insert into test values(13,'mmm','mmm','mmm',null,'2016-5-17');
insert into test values(14,'ma','ma','ma',null,'2016-5-17');
insert into test values(15,'mb','mb','mb',null,'2016-5-17');
insert into test values(16,'mc','mc','mc',null,'2016-5-17');
insert into test values(17,'mabc','mabc','mabc',null,'2016-5-17');
insert into test values(18,'mbac','mbac','mbac',null,'2016-5-17');


select * from test where tno > 3;

select * from test where tno>3 and tno<7; 
select * from test where tno between 3 and 7;
select * from test where fst_nm is null;
select * from test where lst_nm is null;
select * from test where lst_nm is null;

select * from test where tno not in (2,4,6,8,10);

select * from test where fst_nm like 'm__c';

select * from test where cre_dt > '2016-5-3';

select tno, concat(lst_nm,fst_nm) as name from test;
select tno, concat_ws(' ',lst_nm,fst_nm,email) as name from test;

select tno, char_length(email) as email_length from test;
select tno, substr(email,1,2) from test;