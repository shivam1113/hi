drop table trainee cascade constraint;

create table trainee ( traineeid number primary key,traineeName varchar2(15) ,traineedomain varchar2(15),traineelocation varchar2(15));

insert into trainee values(1,'Shivam Rastogi','JEE','Mumbai');
insert into trainee values(2,'Dishang Jain','JEE','Mumbai');
insert into trainee values(3,'Mayur Mishra','JPA','Pune');
insert into trainee values(4,'Hitesh Pant','Python','Delhi');
