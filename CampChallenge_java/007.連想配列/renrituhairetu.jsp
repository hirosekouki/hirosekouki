<%-- 
    Document   : renrituhairetu
    Created on : 2018/05/07, 14:00:31
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
<%@ page import="java.util.*" %>
<%
// ユーザー情報をHashMapにまとめ、ArrayListで管理する
HashMap<String, String> user1 =
            new HashMap<String, String>();
HashMap<String, String> user2 =
            new HashMap<String, String>();
HashMap<String, String> user3 =
            new HashMap<String, String>();
HashMap<String, String> user4 =
            new HashMap<String, String>();

user1.put("name", "1"); user1.put("age", "AAA");
user2.put("name", "hello"); user2.put("age", "World");
user3.put("name", "soeda"); user3.put("age", "33");
user4.put("name", "20"); user4.put("age", "20");

ArrayList<HashMap> data = new ArrayList<HashMap>();

data.add(user1);
data.add(user2);
data.add(user3);
data.add(user4);

out.print(data);
%>
    </body>
</html>
