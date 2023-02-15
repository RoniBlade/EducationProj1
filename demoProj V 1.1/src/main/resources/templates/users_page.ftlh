<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>User</title>
    <link rel='stylesheet' href='css/style.css'>
</head>
<body>
<#include "/navigation.ftlh">
    <table>
    <tr>
        <th>Register</th>
    </tr>
    <#list users as user>
        <tr>
            <th>${user.email}</th>
            <th>${user.firstName}</th>
            <th>${user.lastName}</th>
            <td><a href="/users/${user.id}"> Перейти</a></td>
            <td><a href="/users/${user.id}/delete"> Удалить</a></td>
        </tr>
    </#list>
    </table>
<form action="/users" method="post">
        <label>
             Email
            <input type="email" name="email" placeholder="Введите почту">
        </label>
        <label>
             First Name
            <input type="text" name="firstName" placeholder="Введите имя">
        </label>
        <label>
             Last Name
            <input type="text" name="lastName" placeholder="Введите фамилию">
        </label>
        <input autofocus type="submit" value="Добавить"/>
</form>
</body>
</html>