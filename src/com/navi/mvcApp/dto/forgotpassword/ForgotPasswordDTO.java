package com.navi.mvcApp.dto.forgotpassword;

public class ForgotPasswordDTO {
	
	public ForgotPasswordDTO() {
		System.out.println(this.getClass().getSimpleName() + " created..");
	}
	
	private String userid;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "ForgotPasswordDTO [userid=" + userid + "]";
	}

}
