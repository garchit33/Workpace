create table myTable( c1 int primary key, c2 int not null, c3 int not null, c4 varchar(10), INDEX (c2,c3));

show indexes from mytable;

select employeeNumber, lastName, firstName from employees where jobTitle = 'Sales Rep';

create index jobTitle on employees(jobTitle);
show indexes from employees;

explain select employeeNumber,lastName, firstName from employees where jobTitle='Sales Rep';

drop index jobTitle on employees;

create view emp_view as select employeeNumber, lastName, firstName from employees;

select * from emp_view;