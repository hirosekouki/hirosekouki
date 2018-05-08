<%-- 
    Document   : forbun2
    Created on : 2018/05/08, 10:03:54
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
        String NAME = "A";

       
        
        for(int i =1;i<30;i++){
         NAME = NAME + "A";
        
        }
        
        out.print(NAME);



        %>
    </body>
</html>
