CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
    select distinct salary from (select salary,dense_rank() over(order by salary desc) as rnk from Employee) t  where t.rnk=N



  );
END