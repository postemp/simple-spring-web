create table products(
  id bigserial primary key,
  title varchar(255),
  cost int
);

insert into products (title, cost) values
 ('Milk', 80),
 ('Bread', 32),
 ('Cheese', 320);