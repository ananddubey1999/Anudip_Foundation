create database Example2Thapa;
use Example2Thapa;
CREATE TABLE Students (id int  , Fname varchar(55) , Lname varchar(55) , age int, primary key(id));
desc Students;
insert into Students(id,Fname,Lname,age) values(1,'Anand' , 'Dubey' , 24),(2,'Anuj' , 'Tripathi' , 9),(3,'Arav' , 'Pandey' , 7),(4,'Raghav' , 'Raam' , 25),(5,'Pragati' , 'Tripathi' , 12),(6,'Manya' , 'Dubey' , 3),(7,'Dhundhun' , 'Dubey' , 1) , (8,"raj","aryan",20);
select * from Students;
UPDATE Students SET age = 23 WHERE id = 1;
delete from Students where id = 8;
