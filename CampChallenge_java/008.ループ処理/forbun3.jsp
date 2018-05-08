<%-- 
    Document   : forbun3
    Created on : 2018/05/08, 11:33:08
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
        <%

int sum = 0;
for (int number = 0; number <= 100; number++){
    sum += number;
}
out.print("sum"+sum);

%>
    </body>
</html>
