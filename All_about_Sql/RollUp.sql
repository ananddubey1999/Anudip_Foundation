create database RolllUp;
use RolllUp;
create table RollUpTest( id int , naam varchar(55), gender varchar(55) , salary int , Dep varchar(55));
insert into RollUpTest( id , naam , gender , salary , Dep ) values (1,'Moly','Male',5000,'Sale'),(2,'Jimmy','Female',6000,'HR'),
(3,'Katal','Female',7500,'IT'),(4,'Lenda','Male',6500,'Sale'),(5,'Shnana','afemale',5500,'HR'),(6,'Jon','Male',9000,'IT');
select * from RollUpTest;
select Dep , sum(salary) from RollUpTest group by Dep;
SELECT Dep, SUM(salary) FROM RollUpTest GROUP BY Dep UNION SELECT 'Total', SUM(salary) FROM RollUpTest;
