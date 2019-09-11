create table Employee
(emp_id int, emp_name varchar(50), emp_age int, dept_id int, salary double, incentive double);
insert into Employee values(101, "Ramesh", 28, 4565, 50000.00, 3000.00);
insert into Employee values(102, "Suresh", 26, 4567, 40000.00, 2500.00);
insert into Employee values(103, "abc", 23, 4568, 30000.00, 2500.00);
insert into Employee values(104, "derr", 26, 4569, 40000.00, 2500.00);
insert into Employee values(105, "xyz", 26, 4570, 45500.00, 2500.00);
insert into Employee values(106, "Archit", 26, 4571, 49000.00, 2500.00);
insert into Employee values(107, "qwer", 26, 4572, 46000.00, 2500.00);
insert into Employee values(108, "asd", 26, 4573, 38000.00, 2500.00);
insert into Employee values(109, "ghj", 26, 4574, 15000.00, 2500.00);
insert into Employee values(110, "zxc", 26, 4575, 8000.00, 2500.00);
insert into Employee values(111, "qws", 26, 4576, 89000.00, 2500.00);
insert into Employee values(112, "uty", 26, 4577, 56000.00, 2500.00);
insert into Employee values(113, "mnb", 26, 4578, 90000.00, 2500.00);
insert into Employee values(114, "rfv", 26, 4579, 76000.00, 2500.00);
insert into Employee values(115, "pom", 26, 4580, 98000.00, 2500.00);
insert into Employee(emp_id, emp_name, emp_age, salary, incentive)  values(116, "sunny", 23,98000.00, 2500.00);

select * from Employee;
select avg(salary) sal from Employee;
select count(dept_id) as total_depts from Employee;
update Employee set dept_id=4581 where emp_id=116;
select emp_id, emp_name, sum(salary*0.8) totalsal from Employee group by emp_id;
select MAX(salary) as max_sal from employee;
select min(salary) as min_sal, max(salary) as max_sal from employee;

select substring("Hello world",-4) as sorted;
select substring(emp_name,-2) as sorted from employee;

CREATE TABLE dogs (
  id INTEGER NOT NULL PRIMARY KEY, 
  name VARCHAR(50) NOT NULL
);

CREATE TABLE cats (
  id INTEGER NOT NULL PRIMARY KEY, 
  name VARCHAR(50) NOT NULL
);

INSERT INTO dogs(id, name) values(1, 'Lola');
INSERT INTO dogs(id, name) values(2, 'Bella');
INSERT INTO cats(id, name) values(1, 'Lola');
INSERT INTO cats(id, name) values(2, 'Kitty');

select distinct name from (cats,dogs) 
