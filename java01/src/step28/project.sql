create table PROJECTS (
  PNO   int primary key auto_increment,
  TITLE varchar(200) not null,
  SDT   datetime not null,
  EDT   datetime not null,
  DESCT text,
  STAT  int default 0
);