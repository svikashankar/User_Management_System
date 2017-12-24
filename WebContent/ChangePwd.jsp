<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password...</title>
</head>

<body>
<h1 align="center"><strong>${dto.username}</strong>,Change your Password Here</h1>
<form action="changepwd.do" method="post">
<pre>
UserId:<input type="text" name="userid" />
Old Password:<input type="password" name="opwd" />
New Password:<input type="password" name="npwd" />
Confirm Password:<input type="password" name="cpwd" />
<input type="submit" value="ChangePassword" />
</pre>
</form>
</body>
</html>