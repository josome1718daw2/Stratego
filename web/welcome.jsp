<%--
  Created by IntelliJ IDEA.
  User: Chema
  Date: 09/03/2018
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (session.getAttribute("username")==null){
        response.sendRedirect("index.jsp");
    }
%>
    Bienvenido ${username}

    <h2> Primer paso conseguido....</h2>

<form action="Logout">
    <input type="submit" value="Logout">
</form>

</body>
</html>
