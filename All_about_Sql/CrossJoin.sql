create database crossjoin;
use crossjoin;
create table students(id int , naam varchar(55) , age int);
insert into students (id , naam , age ) values(1 , 'raam' ,25),(2 , 'shyaam' ,24),(3 , 'hanumaan' , 22);

use crossjoin;
create table city(id int , CityNaam varchar(55));
insert into city (id , CityNaam ) values(1 , 'Ayodhya'),(2 , 'Mathura'),(3 , 'Mathura');

select * from students cross join city;