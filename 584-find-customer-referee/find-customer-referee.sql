# Write your MySQL query statement below
Select c1.name from customer  c1 left join
customer c2 on c1.id=c2.id where c2.referee_id!=2 or c2.referee_id is null;