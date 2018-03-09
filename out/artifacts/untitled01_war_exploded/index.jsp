<%--
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
--%>
<%--
    Document   : BeanEL
    Created on : 25/01/2014, 09:18:12
    Author     : sergi
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="login.ConnexioMesProves" %>
--%>

<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title></title>
  <ct:taula numFiles="3" numColumnes="2" color="red" />
</head>
<body>


<%--<jsp:useBean id="persona1" class="daw2.Persona" scope="session"/>
<c:set target="${persona1}" property="nom" value="${param.nom}" />
<h1>${persona1.nom}</h1>


<%
  ConnexioMesProves tc = new ConnexioMesProves();
  out.print(tc.obtenirConnexio());
  %>



<a href="BeanEL2.jsp">BeanEL2</a>

--%>


<h1>Login</h1>

  <form action="Login">
    User:     <input type="text" name="uname"> <br>
    Password: <input type="password" name="pass"><br>

    <p><input type="submit" value="login" ></p>

  </form>



</body>
</html>