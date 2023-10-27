SELECT * FROM customer
INNER JOIN Orders 
ON customer.Cid = Orders.Cid;
