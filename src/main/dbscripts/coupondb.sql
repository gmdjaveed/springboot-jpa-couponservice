create database coupondb;

use coupondb;

create table coupon(
id int AUTO_INCREMENT primary KEY,
code varchar(20) UNIQUE,
discount decimal (10,3),
exp_date varchar(100)
);

select * from coupon;

--create database productdb;

--use productdb;


