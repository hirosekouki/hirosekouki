<%-- 
    Document   : sisokuenzan
    Created on : 2018/04/27, 15:01:10
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

out.print("1");

float point = 0.7F;
float ap = age * point;

out.print(ap);                    

int num1 = 6;
int num2 = 7;
int num3 = 8;
int num4 = 7;
int num5 = 5;

out.print(++num1); // +1されてから、print
out.print(num2++); // printしてから+1
out.print(--num3); // -1してから、print
out.print(num4--); // printしてから-1
out.print(++num5);
%>
    </body>
</html>
