<%-- 
    Document   : index
    Created on : Mar 20, 2019, 11:57:55 AM
    Author     : Chris Skov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello INDEX PAGE</h1>
        <form action="FrontController?origin=shop" method="post">
            email:
            <input type="text"name="email"value="hej">
            password:
            <input type="password"name="password"value="1">
            <input type="submit"value="submit">
        </form>
    </body>
</html>
