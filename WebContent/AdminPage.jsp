<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login Page</title>
</head>
<body>
<p align="right">Hi, ${dto.username}</p>  <br />
<br>
<h1>welcome Admin</h1><br />
<a href="ChangePwd.jsp">Change Password</a> <br />
<br>
<a href="UpdateDetails.jsp">Update Details</a> <br>
<a href="UserDetails.jsp">User Data</a>
<a href="Login.jsp">Logout</a> <br>
<h1 >${msg}</h1> <br />
<h3>${id}</h3>
<!--<h3>${UserData}</h3>  -->
</body>
</html>



