-- Last updated: 11/08/2026, 20:25:31
select MAX(salary) as SecondHighestSalary
from Employee
where salary < (select Max(salary) from Employee)