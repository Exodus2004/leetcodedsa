select q.Department as Department,q.Employee as Employee,q.salary as salary from (SELECT t.first as Department, t.second as Employee, t.third as Salary ,dense_rank() over (partition by t.first order by t.third desc) as nothing
FROM (
    SELECT Department.name as first, Employee.name as second, Employee.salary as third 
    FROM Department 
    INNER JOIN Employee ON Department.id = Employee.departmentId
) t )q where q.nothing <=3;