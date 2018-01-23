<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
<p align="right" >${dto.username}</p>
<form action="update.do" method="post">
<pre>
UserId: <input type="text" name="userid" value="${dto.userid}" readonly="readonly" id="userid"/>
Email: <input type="text" name="email" value="${dto.email}" readonly="readonly" id="email" />
Mobile No. :<input type="text" name="mobile" value="${dto.mobile}"  id="mobile" />
Password: <input type="password" name="password" value="${dto.password}"  id="password" />
Confirm Password: <input type="password" name="confirmpassword" value="${dto.confirmpassword}"  id="cofirmpassword" />
UserName: <input type="text" name="username" value="${dto.username}"  id="username" />
<input type="submit" value="Update" />
<input type="submit" value="Cancel">
</pre>
</form>
</body> 
</html>