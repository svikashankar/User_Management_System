package com.navi.mvcApp.dto.update;

import java.io.Serializable;

public class UpdateDTO implements Serializable{
	
	private String userid;
	private String email;
	private String password;
	private String confirmpassword;
	private long mobile;
	private String username;
	
	public UpdateDTO() {
		System.out.println(this.getClass().getSimpleName() + " created...");
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UpdateDTO [userid=" + userid + ", email=" + email + ", password=" + password + ", confirmpassword="
				+ confirmpassword + ", mobile=" + mobile + ", username=" + username + "]";
	}
	
	
	

}
