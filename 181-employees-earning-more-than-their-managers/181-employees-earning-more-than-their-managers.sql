select e1.name as Employee from Employee as e1 ,Employee as e2
where e1.managerid=e2.id and e1.salary> e2.salary;