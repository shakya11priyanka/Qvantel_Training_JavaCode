create table Course(
 name varchar(40),
	Roll_no varchar(100) references student(roll)
)
create table Student(
  Roll varchar(50) primary key not null,
  name varchar(50) ,
  class varchar(40)
)
insert into Student values(1, 'Priyanka', 'Final');
alter table Student modify roll into Enrollment int;