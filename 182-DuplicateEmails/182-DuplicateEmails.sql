-- Last updated: 11/08/2026, 19:56:29
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email) > 1;