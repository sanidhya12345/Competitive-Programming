# Write your MySQL query statement below
with leaf_node as (
select a.id from tree a left join tree b on a.id = b.p_id 
where a.p_id is not null and b.id is null
)

select  id,
        case when p_id is null then 'Root'
             when id in (select id from leaf_node) then 'Leaf' 
             else 'Inner' end as type
from tree
order by id