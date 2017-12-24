<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
h1{
color:cyan;
font-style:oblique;
font-family: monospace;
position: absolute;

}
</style>
</head>
<body bgcolor="grapes">
<p align="right">Hi, ${dto.username}</p>  <br />
<br>

<a href="ChangePwd.jsp">Change Password</a> <br />
<br>
<a href="UpdateDetails.jsp">Update Details</a> <br>
<a href="Login.jsp">Logout</a> <br>
<h1 >${msg}</h1> <br />
</body>
</html>