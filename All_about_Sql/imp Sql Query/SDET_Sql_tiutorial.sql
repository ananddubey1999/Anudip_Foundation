create database mydb;
use mydb;
create table STUDENT(Sno int(5),Sname varchar(15) , Marks int(3)); 
 desc student;
 insert into student values(101, "Anand", 89);
 insert into  student(Sno , Sname , Marks) values(102,"Ram" , 90);
insert into  student(Sno , StuName , Marks) values(102,"Ram" , 90),(103,"Ravi" , 70),(104,"Ajay" , 60);
select * from student;
describe student;

-- # using where clause
select * from student where marks= 90;

-- # add new column in table
alter table student add(Grade varchar(20));

-- # drowp the column in the table 
alter table student drop column grade;

-- # Modifying a column from table 
alter table student modify column Sname varchar(55);

-- # Renaming a column of the table
alter table student rename column Sname to StuName;

-- # Delete and RollBack in table
Set sql_safe_updates =0;
select * from student;
delete from student;
-- #commit command change the db prmanently
rollback;

-- #Truncate command is us to delete thr data permanently
truncate table student;

-- #MySQL Functions
-- #String functions

--  1 Upper case use 
select upper(StuName) from student;

--  2 Lower case use 
select lower(StuName) from student;

--  3 length of the String it give length size  ram = 3
select length('ram');
-- print  name whose has 4 char
select * from student where length(StuName)>3;

-- 4 Trim it will give space in both side of string and remove char
select trim('  Ram '); 
select trim('y' from 'Ajay');

-- 5 INSTR(): it retun the position of char in strimh 
select instr('Ajay' , 'j');

-- 6 Concat() this will join the two String
select concat('Ravi' , 'Ajay'); 



 