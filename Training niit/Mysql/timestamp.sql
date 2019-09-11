create table new_timestamp
( t1 timestamp);
select * from new_timestamp;
desc new_timestamp;

set time_zone = '+05:30';
insert into new_timestamp values('2019-07-02 00:10:08');


create table bookcategories(bookid int auto_increment primary key, bname varchar(200) not null, order_created_at timestamp default current_timestamp);
insert into bookcategories(bname) values('Encyclopedia');
insert into bookcategories(bname) values('Encyclopedia vol 1');
alter table bookcategories add column updated_at timestamp default current_timestamp;

drop table bookcategories;       
select * from bookcategories;





