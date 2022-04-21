# Write your MySQL query statement below
SELECT user_id,CONCAT(UPPER(SUBSTR(name,1,1)),LOWER(SUBSTR(name,2, LENGTH(name) -1 ))) as name from Users order by user_id ;