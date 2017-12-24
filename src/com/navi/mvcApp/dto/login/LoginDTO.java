package com.navi.mvcApp.dto.login;

import java.io.Serializable;

public class LoginDTO implements Serializable {

	private String userid;
	private String password;

	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [userid=" + userid + ", password=" + password + "]";
	}
	

}
