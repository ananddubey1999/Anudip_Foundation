use thapatechnical;
select customer.Cid , Cname ,OAmount
from customer
Left join orders
On customer.Cid = orders.Cid;