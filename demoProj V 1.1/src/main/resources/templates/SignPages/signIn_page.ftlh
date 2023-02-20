<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User</title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    <div class="page">
      <div class="box">
        <div class="form">
          <h2>Sign in</h2>
          <form action="/signIn" method="post">
            <div class="inputBox">
              <input type="email" name="email" required>
              <span>Email</span>
              <i class="fas fa-envelope"></i>
            </div>
            <div class="inputBox">
              <input type="password" name="password" required>
              <span>Password</span>
              <i class="fas fa-lock"></i>
            </div>
            <div class="links">
                <div class="checkbox-wrapper">
                  <input type="checkbox" name="rememberMe" id="checkbox1">
                  <label for="checkbox1">Remember me</label>
                </div>
            </div>
            <input type="submit" value="Login">
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
