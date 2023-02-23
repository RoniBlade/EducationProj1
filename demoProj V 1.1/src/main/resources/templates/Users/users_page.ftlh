<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>User</title>
    <link rel='stylesheet' href='css/user_style.css'>
</head>
<body>
<div class="page">
<div class="content">
<#include "/navigation.ftlh">
</div>
<div class="content">
   <table>
      <thead>
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Email</th>
        </tr>
      </thead>
      <tbody>
<#list users as user>
        <tr onclick="location.href='/users/${user.id}';">
          <td>${user.firstName}</td>
          <td>${user.lastName}</td>
          <td>${user.email}</td>
        </tr>
    </#list>
      </tbody>
    </table>
    </div>
<div class="content">
<h4>Add Student</h4>
<div class="content-box">
    <div class="box">
        <div class="form">
          <form action="/users" method="post">
            <div class="inputBox">
              <input type="email" name="email" required>
              <span>Email</span>
              <i></i>
            </div>
            <div class="inputBox">
              <input type="text" name="firstName" required>
              <span>First Name</span>
              <i></i>
            </div>
            <div class="inputBox">
              <input type="text" name="lastName" required>
              <span>Last Name</span>
              <i></i>
            </div>
            <div class="inputBox">
              <input type="password" name="password" required>
              <span>Password</span>
              <i></i>
            </div>
            <input type="submit" value="Add">
          </form>
        </div>
</div>
    </div>
</div>
</div>
</body>
</html>