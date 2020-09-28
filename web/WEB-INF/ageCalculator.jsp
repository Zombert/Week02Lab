<%-- 
    Document   : ageCalculator
    Created on : 27-Sep-2020, 6:42:57 PM
    Author     : bmxde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form method="post" action="agecalculator">
        <h1>Age Calculator</h1>
        Enter your age: <input type="text" id="age" name="age" value="${newAge}"><br>
        <h2>${x}</h2>
        <input type="submit" name="Age next birthday"><br>
        <a href="arithmeticcalculator">Arithmetic Calculator</a>
        </form>
    </body>
</html>
