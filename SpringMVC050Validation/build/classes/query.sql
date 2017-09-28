drop table Users cascade constraint;

create table Users ( userName varchar2(20) primary key,password varchar2(12) not null,fullName varchar2(20) not null);

insert into users values('shivaras','Capgemini','Shivam Rastogi');
