<%-- 
    Document   : hensuu
    Created on : 2018/04/27, 10:54:06
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
int age = 100;
String a = "77";

out.print(a);

out.print("私は広瀬光輝です");

float point = 0.7F;
float ap = age * point;

out.print(ap);
%>
    </body>
</html>
