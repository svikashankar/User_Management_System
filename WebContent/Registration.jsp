<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UMS</title>
<link href="Style.css" rel="stylesheet"></link>
<script type="text/javascript" src="Registration.js"></script>
</head>
<body>
<form onsubmit="return validate()" action="register.do" method="post" >
<h1>${successMessage}</h1>
<center><h1>WELCOME TO Jspiders</h1> </center>
<pre>
<table>
        <tbody>
<tr><td><label>UserName<sup>*</sup></label>  </td><td><input type="text" name="username" id="username" /></td></tr>
<tr><td><label>Email<sup>*</sup></label>     </td><td><input type="text" name="email" id="email" /></td></tr>
<tr><td><label>UserID<sup>*</sup></label>    </td><td><input type="text" name="userid" id="userid" /></td></tr>
<tr><td><label>Password<sup>*</sup></label>  </td><td><input type="password" name="password" id="password" /></td></tr>
<tr><td><label>Confirm Password<sup>*</sup></label></td><td><input type="password" name="confirmpassword" id="cpassword" /></td></tr>
<tr><td><label>Mobile No.</label>            </td><td><input type="text" name="mobile" id="mobile" /></td></tr>
<tr><td><label>Security Question</label>     </td><td><select name="question" id="question" ><option>Favorite Player</option><option>Favorite Food</option></select></td></tr>
<tr><td><label>Security Answer</label>       </td><td><input type="text" name="answer" id="answer" /></td></tr>
<tr><td><label>Role</td><td></label>                   <select name="role"><option value="0">Admin</option><option value="1">User</option><option value="2">Vendor</option></select></td></tr>
</pre> </tbody>
    </table><center>
    
<input type="submit" value="Register" />
<input type="reset" value="Clear" />
</center>
<br/><center>
    <a href="Login.jsp">Login</a></center>
  
</form>
</body>
</html>