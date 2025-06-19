# Write your MySQL query statement below
SELECT 
    v.customer_id, 
    COUNT(visit_id) as count_no_trans
FROM 
    Visits v
WHERE 
    v.visit_id NOT IN (
        SELECT visit_id 
        FROM Transactions
    )
GROUP BY
    customer_id;