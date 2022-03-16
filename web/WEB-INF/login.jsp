<%-- 
    Document   : login
    Created on : 16-Feb-2022, 2:37:42 PM
    Author     : Raj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
  <body>
        <h1>Login</h1>
        <form method="post" action="login">
            <label>Username:</label>
            <input type="text" name="username" value="${username}"><br>
            <label>Password:</label>
            <input type="password" name="password" value=""><br>
            <input type="submit" name="login" value="Log in">
        </form>
        <p>${error}
        ${message}
        </p>
    </body>
</html>
