package com.navi.mvcApp.dto.register;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class RegisterDTO implements Serializable {

	@Id
	@Column(name = "r_id")
	@GenericGenerator(name = "id", strategy = "increment")
	@GeneratedValue(generator = "id")
	private int id;
	private String username;
	private String email;
	private String userid;
	private String password;
	private String confirmpassword;
	private long mobile;
	private String question;
	private String answer;
	private int role;

	public RegisterDTO() {
		System.out.println(this.getClass().getSimpleName() + " created..");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "RegisterDTO [id=" + id + ", username=" + username + ", email=" + email + ", userid=" + userid
				+ ", password=" + password + ", confirmpassword=" + confirmpassword + ", mobile=" + mobile
				+ ", question=" + question + ", answer=" + answer + ", role=" + role + "]";
	}

	

}
