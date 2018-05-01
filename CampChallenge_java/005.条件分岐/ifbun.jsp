<%-- 
    Document   : ifbun
    Created on : 2018/04/27, 17:08:05
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
int num = 3;


if (num == 1) {
    out.print("1です！<br>");
}else if (num == 2) {
    out.print("プログラミングキャンプ！<br>");
} else {
    out.print("その他です！");
}


%>
    </body>
</html>
