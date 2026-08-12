-- Last updated: 12/08/2026, 18:27:43
SELECT P.product_name ,S.year  ,S.price 
FROM Sales  S
LEFT JOIN Product P
ON S.product_id =P.product_id 

