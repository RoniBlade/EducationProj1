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
        <th>Courses</th>
    </tr>
    <#list courses as course>
        <tr>
            <th>${course.title}</th>
            <#if role == "ADMIN">
            <td><a href="/courses/${course.id}"> Перейти</a></td>
            </#if>
        </tr>
    </#list>
    </table>
</body>
</html>