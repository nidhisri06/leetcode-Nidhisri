-- Last updated: 11/08/2026, 20:24:16
SELECT e.name
FROM Employee AS e 
INNER JOIN Employee AS m ON e.id = m.managerId 
GROUP BY m.managerId 
HAVING COUNT(m.managerId) >= 5