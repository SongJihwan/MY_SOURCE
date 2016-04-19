create table MEMBERS (
  MNO   int primary key auto_increment,
  MNAME varchar(50) not null,
  EMAIL varchar(100) not null,
  PWD   varchar(10) not null,
  TEL   varchar(30)
);

insert into MEMBERS(MNAME, EMAIL, PWD) values('홍길동', 'hong@test.com', '1111');
insert into MEMBERS(MNAME, EMAIL, PWD) values('임꺽정', 'lim@test.com', '1111');
insert into MEMBERS(MNAME, EMAIL, PWD) values('이순신', 'lee@test.com', '1111');
