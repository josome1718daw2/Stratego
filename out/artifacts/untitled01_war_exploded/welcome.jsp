<%--
  Created by IntelliJ IDEA.
  User: Chema
  Date: 09/03/2018
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="ct" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    Bienvenido ${nom}

    <h2> Primer paso conseguido....</h2>

<form action="Logout">
    <input type="submit" value="Logout">
</form>

<div align="center">
    <ct:taula numFiles="10" numColumnes="10"  />
</div>

</body>
</html>
