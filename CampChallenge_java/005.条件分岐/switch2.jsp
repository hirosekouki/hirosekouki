<%-- 
    Document   : switch2
    Created on : 2018/05/01, 14:42:48
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
switch('A') {
case 'A':
out.print("英語");
break;
case 'あ':
out.print("日本語");
break;
default:
out.print("なにも表示しない");
break;
}
%>
    </body>
</html>
