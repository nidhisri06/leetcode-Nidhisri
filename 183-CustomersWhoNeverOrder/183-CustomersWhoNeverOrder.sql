-- Last updated: 11/08/2026, 19:56:27
SELECT name as Customers
from Customers
where id not in (
    select customerId
    from Orders
);