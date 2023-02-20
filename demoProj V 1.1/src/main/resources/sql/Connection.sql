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

/* CSS for the sign-in page */

/* Set the font family and font size */
body {
  font-family: Arial, sans-serif;
  font-size: 16px;
}

/* Center the sign-in box */
.page {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  background-color: #f2f2f2;
}

.box {
  width: 400px;
  background-color: white;
  padding: 20px;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
}

/* Style the form elements */
.form h2 {
  font-size: 24px;
  text-align: center;
}

.inputBox {
  position: relative;
  margin-bottom: 20px;
}

.inputBox input {
  width: 100%;
  padding: 10px 0;
  font-size: 16px;
  border: none;
  border-bottom: 1px solid #ccc;
  outline: none;
  background: transparent;
}

.inputBox span {
  position: absolute;
  top: 0;
  left: 0;
  padding: 10px 0;
  font-size: 16px;
  color: #ccc;
  transition: 0.5s;
  pointer-events: none;
}

.inputBox input:focus ~ span,
.inputBox input:valid ~ span {
  color: #555;
  transform: translateY(-20px);
}

.inputBox i {
  position: absolute;
  top: 50%;
  right: 0;
  transform: translateY(-50%);
  font-size: 18px;
  color: #999;
}

.links {
  margin-bottom: 20px;
}

.links input {
  margin-right: 10px;
}

.links label {
  font-size: 14px;
}

input[type="submit"] {
  background-color: #4CAF50;
  color: white;
  border: none;
  padding: 10px 20px;
  cursor: pointer;
  transition: background-color 0.5s;
}

input[type="submit"]:hover {
  background-color: #3e8e41;
}