/**
 * 
 */
function validate() {
	var username=document.getElementById("username").value;
	var email=document.getElementById("email").value;
	var userid=document.getElementById("userid").value;
	var password=document.getElementById("password").value;
	var cpassword=document.getElementById("cpassword").value;
	
	if(username=="" ){
		alert("Enter valid User Name");
		return false;
	}
	
	if (/^\w+([\.-]?\ w+)*@\w+([\.-]?\ w+)*(\.\w{2,3})+$/.test(email))
	{
	return (true)
	}
	alert("You have entered an invalid email address!")
	return (false)
	
	if(email==""){
		alert("Enter valid Email");
		return false;
	}
	
	if(userid==""){
		alert("Enter User ID");
		return false;
	}
	
	if(password.length<8){  
		  alert("Password must be at least 6 characters long.");  
		  return false;  
	}
	
	if(password==""){
		alert("Enter password");
		return false;
	}
	
	if(password!=cpassword){
		alert("Password and Confirm Password are not Matching");
		return false;
	}
	return true;
	
}