create database HavingClause ;
use HavingClause;
create table Emp2(Eid int , Dname varchar(55) , Esal int);
insert into Emp2(Eid , Dname , Esal) values(1 , 'sale',10000),(2 , 'HR',15000),(3 , 'sale',20000),(4 , 'sale',10000),
(5 , 'HR',23000),(6 , 'product',25000),(7 , 'sale',25000),(8 , 'product',12000),(9 , 'sale',18000),(10 , 'sale',37000),
(11 , 'HR',63000);
select Dname , count(*) from Emp2 group by Dname;
SELECT Dname, COUNT(*) FROM Emp2 GROUP BY Dname HAVING COUNT(*) >= 3;
SELECT Dname, Esal, count(*) FROM Emp2 GROUP BY Dname , Esal HAVING Esal >=25000;









