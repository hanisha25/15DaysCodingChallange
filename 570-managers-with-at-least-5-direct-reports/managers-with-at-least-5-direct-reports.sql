# Write your MySQL query statement below
SELECT name from Employee
where id IN (Select  managerId from Employee  where managerId is not null
group by managerId  having count(*)>=5);