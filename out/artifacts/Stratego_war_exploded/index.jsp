<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.login.Registre_Func" %>




<!DOCTYPE html>
<html>
<head>


    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js" integrity="sha384-feJI7QwhOS+hwpX2zkaeJQjeiwlhOP+SdQDqhgvvo1DsjtiSQByFdThsxO669S2D" crossorigin="anonymous"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Login</title>

</head>
<body>



<form action="/login" method="post">
  Login
  User:     <input type="text" name="nom"> <br>
  Password: <input type="text" name="password"><br>

  <input type="submit" value="envia"/>
</form>

<h2>codigo david</h2>
<form action="/login">
  User:     <input type="text" name="uname"> <br>
  Password: <input type="password" name="pass"><br>

  <p><input type="submit" value="Envia" ></p>

</form>
<h1>Registre</h1>
<form action="Registre" method="post">
  User:     <input type="text" name="uname"> <br>
  Password: <input type="password" name="pass"><br>

  <p><input type="submit" value="Envia" ></p>

</form>



<div align="center">
<form  action="/login" class="form-horizontal" >
    <fieldset>

        <!-- Form Name -->
        <legend>Iniciar Sessión</legend>

        <!-- Text input-->
        <div class="control-group">
            <label class="control-label" for="username">Usuario</label>
            <div class="controls">
                <input id="username" name="uname" type="text" placeholder="" class="input-large">

            </div>
        </div>

        <!-- Password input-->
        <div class="control-group">
            <label class="control-label" for="password">Password</label>
            <div class="controls">
                <input id="password" name="pass" type="password" placeholder="" class="input-large">

            </div>
        </div>

        <!-- Button -->
        <div class="control-group">
            <label class="control-label" for="login"></label>
            <div class="controls">
                <button id="login" name="login" class="btn btn-success">Iniciar Session</button>
                <%--<button id="register" name="register" class="btn btn-primary">Registrar</button>--%>

            </div>
        </div>

    </fieldset>
</form>
</div>

<%--<%
  Registre_Func tc = new Registre_Func();
  out.print(tc.obtenirUsuari());
  out.print(tc.obtenirPassword());
%>--%>

<%--<form action="Register">
  <input type="submit" value="Register">
</form>--%>

</body>
</html>