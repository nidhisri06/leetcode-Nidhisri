-- Last updated: 12/08/2026, 18:27:38
SELECT DISTINCT
    player_id,
    event_date AS first_login
FROM (
    SELECT 
        *,
        ROW_NUMBER() OVER (
            PARTITION BY player_id 
            ORDER BY event_date
        ) AS row_num
    FROM Activity
) t
WHERE row_num = 1;