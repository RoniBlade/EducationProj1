<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign In</title>
</head>
<body>
<form action="/signIn" method="post">
    <label> Ваш email
        <input type="email" placeholder="Input your email" name="email">
    </label>
    <label> Ваш password
        <input type="password" placeholder="Input your password" name="password">
    </label>
    <input type="submit">
</form>
</body>
</html>