<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
</style>
</head>
<body bgcolor="#E6E6FA">
     
    <h1><b><p align="center">Hi, ${dto.username}</p></b></h1>
<br>
<b>
<a href="ChangePwd.jsp">Change Password</a>
<br>
<a href="UpdateDetails.jsp">Update Details</a>
<br>
<a href="Login.jsp">Logout</a> <br></b>
<h1 >${msg}</h1> <br />
</body>
</html>