# Joins
```sql

CREATE TABLE persons (
	p_id int NOT NULL,
	name varchar(400),
	last_order_id int,
	PRIMARY KEY (p_id)
);


CREATE TABLE orders (
	o_id int NOT NULL,
	order_no int NOT NULL,
	p_id int,
	p_name varchar(400),
	PRIMARY KEY (o_id)
);

insert into persons (p_id, name, last_order_id) values(1, 'Test 1', 2);
insert into persons (p_id, name, last_order_id) values(2, 'Test 2', 3);
insert into persons (p_id, name) values(3, 'Test 3');
insert into persons (p_id, name) values(4, 'Awe');
insert into persons (p_id, name) values(5, 'Awe');
	

insert into orders (o_id, order_no, p_id) values(1, 100001, 1);
insert into orders (o_id, order_no, p_id) values(2, 100002, 1);
insert into orders (o_id, order_no, p_id) values(3, 100003, 10);
insert into orders (o_id, order_no, p_id, p_name) values(4, 100004, 10, 'Awe');

//inner join 
//the default join
//match between tables
select * from orders
inner join persons
on orders.p_id=persons.p_id;

//left join
//all rows in the select * from table
//plus: intersection to the right table
select * from orders
left join persons
on orders.p_id=persons.p_id;

select * from orders
left join persons
on orders.p_name=persons.name;

//right
select * from orders
right join persons
on orders.p_id=persons.p_id;

//full
select * from orders
full join persons
on orders.p_id=persons.p_id;
```
