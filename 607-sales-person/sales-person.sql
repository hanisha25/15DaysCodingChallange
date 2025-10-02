# Write your MySQL query statement below
SELECT name FROM SALESPERSON WHERE  sales_id 
NOT IN (Select O.sales_id FROM Orders O INNER JOIN Company C
on O.com_id =C.com_id where c.name='RED')