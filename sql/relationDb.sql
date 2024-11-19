
drop database if exists relationDb;
create database relationDb;
	use relationDb;
	
	create table address(
		id int primary key auto_increment,
		street varchar(255) not null,
		township varchar(255), 
		city varchar(255)

		);

	create table contact (

		id int primary key auto_increment,
		phone varchar(15) not null unique ,
		email varchar(40) not null check(email like '%@%') 

		);

	create table category (

		id int primary key auto_increment,
		name varchar(25) not null unique

		);
	insert into category (name) values ('Foods');
		insert into category (name) values ('Drinks');


	create table product(
		id int primary key auto_increment,
		name varchar(25) not null check(char_length(name) >= 4),
		dt_price int not null default 0,
		ws_price int,
		cat_id int,
		check(ws_price < dt_price),
		foreign key(cat_id) references category(id)
		on delete set null
		on update cascade
		);

	create table customer(
		id int primary key auto_increment,
		name varchar(25) not null
		);

	create table sales(
		id int primary key auto_increment,
		sale_date date
		);


	create table sale_history(
		sales_id int,
		customer_id int,
		product_id int,
		primary key (sales_id,customer_id, product_id),
		foreign key(sales_id) references sales(id),
		foreign key(customer_id) references customer(id),
		foreign key(product_id) references product(id)
		);

