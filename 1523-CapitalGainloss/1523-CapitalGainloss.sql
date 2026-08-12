-- Last updated: 12/08/2026, 18:26:57
SELECT stock_name,  SUM(IF(operation='buy',-price,price)) as capital_gain_loss
from  Stocks
group by stock_name