create table Student_info
(
st_id int, st_name varchar(50), st_age int check(st_age>18));

create table Players
(
P_name varchar(50),
P_Country varchar(25) check(P_Country IN('USA', 'UK', 'INDIA')));

create table Employee
(
emp_name varchar(25),
emp_email varchar(50) check(emp_email Like '%@%'), emp_id varchar(25) check(emp_id Like '_0'));

insert into Employee values("Archit", "garchi7833@gmail.com",80);

create table newpublisher
( pub_id varchar(8), pub_name varchar(30), pub_city varchar(40), 
pub_country varchar(30), 
check((pub_country="India" AND pub_city="Delhi" OR pub_country="India" AND pub_city="Noida")));

insert into newpublisher values(762, "Hard Rock Cafe", "Delhi", "India"); 

create table author
( auth_id varchar(8) NOT NULL, auth_name varchar(50) NOT NULL, country varchar(30) NOT NULL, UNIQUE(auth_id));

insert into author values(101, "Archit","India");
insert into author values(101, "Prince","India");
insert into author values(102, "Prince","India");


create table Employee1
(emp_name varchar(50) NOT NULL, emp_salary double DEFAULT 5000.00); 

insert into Employee1(emp_name) values("Archit");

create table st(st_id int primary key not null auto_increment, st_name varchar(40));
insert into st values(101,"Archit");
select * from st;
insert into st(st_name) values("Prince");

create table customer
(cust_id int primary key, cust_name varchar(50), product_id int, price decimal(4,2),
FOREIGN KEY(product_id) REFERENCES product(product_id)); 

create table product
(product_id int primary key, product_name varchar(50), price decimal(4,2), qty int);

insert into product values(101,"Book", 30.65, 4);
insert into product values(102,"TextBook", 89.87, 2);
insert into product values(103,"Soap", 65.00, 2);

insert into customer values(201, "Archit", 101, 30.65);
insert into customer values(202, "John", 101, 30.65);
insert into customer values(203, "Jack", 102, 89.87);
insert into customer values(204, "Johny", 103, 65.00);

select customer.cust_id, customer.cust_name, product.product_name, product.product_id,product.price from customer,product where customer.product_id = product.product_id;

create table category(cat_id int not null primary key, cat_name varchar(30));
create table bookorder(book_id int not null primary key, bookname varchar(30), qty int, price double);
alter table bookorder
add column cat_id int not null;

create table orders
(order_id int not null primary key, 
cust_name varchar(20), 
order_date date, 
totalamt double,
cat_id int not null,
book_id int not null,
FOREIGN KEY(cat_id) references category(cat_id),
foreign key(book_id) references bookorder(book_id)
);

select * from bookorder;
select * from orders; 

create table category1(cat_id int not null primary key, cat_name varchar(30));
create table bookorder1(book_id int not null primary key, bookname varchar(30), qty int, price double);
create table orders1
(order_id int not null primary key, 
cust_name varchar(20), 
order_date date, 
totalamt double,
cat_id int not null,
book_id int not null,
FOREIGN KEY(cat_id) references category(cat_id)
ON UPDATE CASCADE ON DELETE RESTRICT,
foreign key(book_id) references bookorder(book_id)
ON UPDATE CASCADE ON DELETE RESTRICT
);

insert into category1 values(213,"Story");
insert into bookorder1 values(234,"The Secrets",1,500);
insert into orders1 values(123,"Suresh",'2019-07-31',500,213,234);


