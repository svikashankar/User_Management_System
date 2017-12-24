package com.navi.mvcApp.model.service.changepwd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.mvcApp.dto.changepwd.ChangePwdDTO;
import com.navi.mvcApp.dto.register.RegisterDTO;
import com.navi.mvcApp.model.dao.changepwd.ChangePwdDAO;

@Service
public class ChangePwdService {

	public ChangePwdService() {
		System.out.println(this.getClass().getSimpleName() + " created...");
	}

	@Autowired
	private ChangePwdDAO dao;

	/*
	 * public int changePwdByUseridService(ChangePwdDTO dto) {
	 * 
	 * System.out.println("calling change Pwd By userid Service....");
	 * 
	 * if(dto.getNpwd().equals(dto.getCpwd())) { int
	 * res=dao.changePwdByUserId(dto); return res; } return 0; }
	 */

	public String passwordService(ChangePwdDTO dto, RegisterDTO dtoFromSession) {

		System.out.println("change password service method started...");
		String message = null;

		System.out.println("ChangePasswordDTO-->" + dto);
		System.out.println("RegisterDTO-->" + dtoFromSession);

		if (dtoFromSession.getPassword().equals(dto.getOpwd()) && dtoFromSession.getUserid().equals(dto.getUserid())) {
			System.out.println("UserId and Old password are validated");

			if (dto.getNpwd().equals(dto.getCpwd())) {
				System.out.println("Latest password are matching");
				dao.changePwdByUserId(dto);
				message = "Password Changed Successfully";
			} else {
				System.out.println("Latest Passwords are not matching");
				message = "Latest Password are not matching";
			}
		} else {
			System.out.println("Invalid Userid or Password");
		}
		return message;
	}

}
