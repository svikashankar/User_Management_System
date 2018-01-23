<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="#E6E6FA">
    <h1><b>User Login Page ${msg}</b></h1>
 
<form action="login.do" method="post">
    <pre>
UserId   :<input type="text" name="userid" id="userid" />
Password :<input type="password" name="password" id="password" /> 
<input type="submit" value="Login" />
<a href="Forgot.jsp">Forgot Password</a>
</pre>
</form>
</body>
</html>