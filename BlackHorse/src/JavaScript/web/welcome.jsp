<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/11/14
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center" style="color: red">Welcome:</h1>
<%
    out.println(session.getAttribute("user"));
%>
<hr/>
<span style="align:center; color:yellow">
        Time:<%
    out.println(new Date());
%>
    </span>

</body>
</html>
