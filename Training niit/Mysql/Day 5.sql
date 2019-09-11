select * from orderdetails;
select * from customers;

select sum(priceEach) purchase_amount from orderdetails;

select avg(priceEach) purchase_amt from orderdetails;

select count(salesRepEmployeeNumber) as total_sm from customers;

select distinct count(customerName) as tot_cus from customers;

select count(*) from customers;

create table tab1(
id int primary key, val varchar(20));

create table tab2(
id int primary key, val1 varchar(20));

insert into tab1 values(1, 'A');
insert into tab1 values(2, 'B');
insert into tab1 values(3, 'C');

insert into tab2 values(1, 'T');
insert into tab2 values(3, 'U');
insert into tab2 values(2, 'V');

select tab1.id, tab1.val,tab2.val1 from tab1,tab2 where tab1.id=tab2.id;

select tab1.id, tab1.val, tab2.val1 from tab1 cross join tab2;   # takes the cartesian product.

# data type of the coloumn shoud be same in inner join. 1 coloumn item should be common in inner join. It is intersection of the data means it will take the common data from both the tables.

create table t1(id int, name varchar(30));
create table t2(id int, name varchar(30));

insert into t1 values(1, "Archit");
insert into t1 values(2, "Ahsan");
insert into t1 values(3, "Sumit");
insert into t1 values(5, "Rajat");

insert into t2 values(5, "Prince");
insert into t2 values(1, "Archit");
insert into t2 values(3, "Sumit");
insert into t2 values(2, "Ahsan");

select t1.name, t2.id from t1 left join t2;


