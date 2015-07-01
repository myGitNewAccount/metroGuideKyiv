<%-- 
    Document   : login
    Created on : 01.07.2015, 20:16:33
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Email: </td>
                <td>${uEmail}</td>
                <td>Password: </td>
                <td>${uPassword}</td>
                <td>Existance: </td>
                <td>${existance}</td>
            </tr>
        </table> 
    </body>
</html>
