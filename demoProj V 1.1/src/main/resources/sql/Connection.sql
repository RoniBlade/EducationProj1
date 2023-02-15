alter table account add column description varchar(1000);

select * from account;

insert into account(id, email, password) values (0, 'adam@mail.ru', 'qwerty123');
insert into account(id, email, password) values (1, 'ilys@mail.ru', 'qwerty123');
insert into account(id, email, password) values (2, 'milail@mail.ru', 'qwerty123');
insert into account(id, email, password) values (3, 'vlad@mail.ru', 'qwerty123');
insert into account(id, email, password) values (4, 'andrey@mail.ru', 'qwerty123');
insert into account(email, password) values ('andrey@mail.ru', 'qwerty123');

drop table account;

create table account(
id integer,
email varchar(64),
password varchar(64)
);

truncate table account;