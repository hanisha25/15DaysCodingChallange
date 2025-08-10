# Write your MySQL query statement below
SELECT name 
FROM Customer
WHERE Customer.referee_id!=2 || Customer.referee_id is null;
