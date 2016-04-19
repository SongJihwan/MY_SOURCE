create table BOARDS (
  BNO   int primary key auto_increment,
  TITLE varchar(200) not null,
  CONTS text not null,
  VWCNT int default 0,
  PWD   varchar(10),
  CDT   datetime 
);