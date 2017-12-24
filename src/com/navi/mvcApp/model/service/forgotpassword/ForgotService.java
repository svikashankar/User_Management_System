package com.navi.mvcApp.model.service.forgotpassword;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.navi.mvcApp.model.dao.forgotpassword.ForgotDAO;

@Service
public class ForgotService {

	public ForgotService() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	@Autowired
	private ForgotDAO dao;

	@Autowired
	private JavaMailSender sender;

	public String checkUserIdService(String userid) {

		System.out.println("checkUserIdService started");

		return dao.checkUserByUserid(userid);
	}

	public String resetPwdService(String email) {

		System.out.println(" resetPwdService started");

		UUID uuid = UUID.randomUUID();
		String randompwd = uuid.toString().substring(0, 8);
		System.out.println(randompwd);

		int res = dao.resetPwdByEmailId(email, randompwd);
		if (res != 0) {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo("abhi.c456@gmail.com");
			message.setSubject("new password");
			message.setText("Hi User, \n\n Latest password is : " + randompwd);
			sender.send(message);
			return randompwd;
		}
		return null;
	}
}
