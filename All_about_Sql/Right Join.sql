select customer.Cid , Cname ,OAmount
from customer
right join orders
On customer.Cid = orders.Cid;