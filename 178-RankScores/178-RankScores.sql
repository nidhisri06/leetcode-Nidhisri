-- Last updated: 11/08/2026, 19:56:37
# Write your MySQL query statement below
select score, dense_rank() over(order by score desc) as "rank" from Scores;