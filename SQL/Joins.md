# Joins
```sql

CREATE TABLE persons (
	p_id int NOT NULL,
	name varchar(400),
	PRIMARY KEY (p_id)
);


CREATE TABLE orders (
o_id int NOT NULL,
order_no int NOT NULL,
p_id int,
PRIMARY KEY (o_id),
FOREIGN KEY (p_id) REFERENCES persons(p_id)
);

insert into persons (p_id, name) values(1, 'Test 1');
insert into persons (p_id, name) values(2, 'Test 2');

insert into orders (o_id, order_no, p_id) values(1, 100001, 1);

//inner join
select * from orders
inner join persons
on orders.p_id=persons.p_id;

//left join
select * from orders
left join persons
on orders.p_id=persons.p_id;

//right
select * from orders
right join persons
on orders.p_id=persons.p_id;

//full
select * from orders
full join persons
on orders.p_id=persons.p_id;
```
