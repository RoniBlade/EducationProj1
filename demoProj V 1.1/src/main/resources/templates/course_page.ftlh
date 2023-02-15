<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Пользователь</title>
</head>
<body>
<#include "/navigation.ftlh">
<h1>${course.title}</h1>
<h2>Студенты в курсе</h2>
<table>
    <#list inCourseStudents as student>
    <tr>
        <th>${student.email}</th>
        <th>${student.firstName}</th>
        <th>${student.lastName}</th>
        <td><a href="/users/${student.id}"> Перейти</a></td>
    </tr>
</#list>
</table>
<form action="/courses/${course.id}/students" method="post">
    <label> Студенты
        <select name="student-id">
            <#list notInCourseStudents as student>
            <option value="${student.id}">${student.firstName} ${student.lastName}</option>
            </#list>
        </select>
    </label>
    <input type="submit" value="Add">
</form>
</body>
</html>