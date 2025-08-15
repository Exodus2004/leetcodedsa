select employee_id ,salary as bonus from Employees
where employee_id%2!=0 and name not like "M%"
union 
select employee_id ,0 as bonus from Employees
where employee_id not in(select employee_id from Employees
where employee_id%2!=0 and name not like "M%") order by employee_id;