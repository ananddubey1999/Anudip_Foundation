create database ThapaTechnical;   -- creating database
use ThapaTechnical;  -- use database to create the table
CREATE TABLE Customer (Cid int not null auto_increment primary key , Cname varchar(55),email varchar(100));
insert into Customer( Cid,Cname , email) values(1,'Anand' , 'Anand@1.com'),(2,'Anuj' , 'Anuj@1.com'),(3,'Arav' , 'Arav@1.com');--inserting value in Customer table
desc Customer;  -- it show the table is created
CREATE TABLE Orders (Oid int not null auto_increment primary key , Orderdate date, OAmount int, Cid int , foreign key (Cid) references Customer(Cid));
insert into Orders(Oid, OrderDate, OAmount, Cid) values(1, '2019/06/05', 55, 1),(2, '2019/06/06', 100, 1),(3, '2019/06/07', 200, 2);--inserting the value in order table
select * from Orders,Customer;   -- show the both table
select*from customer, orders where customer.Cid = orders.Cid;  -- For printing the foeign key

-- 