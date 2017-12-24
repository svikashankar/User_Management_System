package com.navi.mvcApp.dto.changepwd;

import java.io.Serializable;

public class ChangePwdDTO implements Serializable {

	public ChangePwdDTO() {
		System.out.println(this.getClass().getSimpleName() + " created...");
	}

	private String userid;
	private String opwd;
	private String npwd;
	private String cpwd;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getOpwd() {
		return opwd;
	}

	public void setOpwd(String opwd) {
		this.opwd = opwd;
	}

	public String getNpwd() {
		return npwd;
	}

	public void setNpwd(String npwd) {
		this.npwd = npwd;
	}

	public String getCpwd() {
		return cpwd;
	}

	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}

	@Override
	public String toString() {
		return "ChangePwdDTO [userid=" + userid + ", opwd=" + opwd + ", npwd=" + npwd + ", cpwd=" + cpwd + "]";
	}
}
