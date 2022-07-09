# Write your MySQL query statement below
select distinct(a.num) as 'ConsecutiveNums' from 
Logs a join Logs b on a.num = b.num 
join Logs c on a.num = c.num 
where b.id = a.id +1 and c.id = a.id +2;