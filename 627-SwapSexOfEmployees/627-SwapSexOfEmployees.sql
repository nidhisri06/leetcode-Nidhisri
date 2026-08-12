-- Last updated: 12/08/2026, 18:29:19
UPDATE Salary 
SET sex = (CASE WHEN sex = 'f' THEN 'm' ELSE 'f' END) 