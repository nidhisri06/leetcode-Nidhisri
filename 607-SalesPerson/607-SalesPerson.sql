-- Last updated: 12/08/2026, 18:29:31
# Write your MySQL query statement below
select name 
from SalesPerson 
where sales_id Not in (select o.sales_id 
from Orders o
join company c
on o.com_id=c.com_id
where c.name ='Red')