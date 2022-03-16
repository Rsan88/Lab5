<%-- 
    Document   : home
    Created on : 17-Feb-2022, 6:20:50 PM
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
        <h1>Home Page</h1>
        <h3><b>Hello ${user1.username}.</b></h3>
        <div>
            <a href="login?logout">Log Out</a>
        </div> 
    </body>
</html>
