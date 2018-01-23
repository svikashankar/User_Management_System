<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User_Management_System</title>
<link href="Style.css" rel="stylesheet"></link>
<script type="text/javascript" src="Registration.js"></script>
</head>
<body>
<form onsubmit="return validate()" action="register.do" method="post" >
<h1>${successMessage}</h1>
<pre>
<label>UserName<sup>*</sup></label>          :<input type="text" name="username" id="username" />
<label>Email<sup>*</sup></label>             :<input type="text" name="email" id="email" />
<label>UserID<sup>*</sup></label>            :<input type="text" name="userid" id="userid" />
<label>Password<sup>*</sup></label>          :<input type="password" name="password" id="password" />
<label>Confirm Password<sup>*</sup></label>:<input type="password" name="confirmpassword" id="cpassword" />
<label>Mobile No.</label>         :<input type="text" name="mobile" id="mobile" />
<label>Security Question</label> :<select name="question" id="question" ><option>Favorite Player</option><option>Favorite Food</option></select>
<label>Security Answer</label>   :<input type="text" name="answer" id="answer" />
<label>Role</label>               : <select name="role"><option value="0">Admin</option><option value="1">User</option><option value="2">Vendor</option></select>
</pre><center>
<input type="submit" value="Register" />
<input type="reset" value="Clear" />
</center>
<br/>
<a href="Login.jsp">Login</a>
</form>
</body>
</html>