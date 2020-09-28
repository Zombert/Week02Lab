<%-- 
    Document   : arithmeticCalculator
    Created on : 27-Sep-2020, 6:43:10 PM
    Author     : bmxde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
            <form method="post" action="arithmeticcalculator">
                <h1>Arithmetic Calculator</h1>
                First <input type='text' name='first' value="${FirstNum}"><br>
                Second <input type='text' name='second' value="${SecondNum}"><br>
                <input type="submit" name="calc" value="+">
                <input type="submit" name="calc" value="-">
                <input type="submit" name="calc" value="*">
                <input type="submit" name="calc" value="%"><br>
                
                ${FinalNum}<br>
                <a href="agecalculator">Age Calculator</a>
            </form>
    </body>
</html>
