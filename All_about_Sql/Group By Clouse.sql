create database groupBy;
use groupBy;
create table Emp(Eid int , Dname varchar(55) , Esal int);
insert into Emp(Eid , Dname , Esal) values(1, 'sale' , 10000),(2, 'HR' , 15000),(3, 'sale' , 20000),(4, 'sale' , 10000),(5, 'HR' , 23000),(6, 'product' , 25000);
select Dname, count(*) from Emp group by Dname;
select Dname, count(*) from Emp where Esal <=20000 group by Dname;
select Dname, max(Esal) from Emp group by Dname;
select Dname, sum(Esal) , avg(Esal) from Emp group by Dname;


