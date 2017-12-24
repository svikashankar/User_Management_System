package com.navi.mvcApp.model.service.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.mvcApp.dto.login.LoginDTO;
import com.navi.mvcApp.dto.register.RegisterDTO;
import com.navi.mvcApp.model.dao.login.LoginDAO;

@Service
public class LoginService {

	public LoginService() {
		System.out.println(this.getClass().getSimpleName() + " created..");
	}

	@Autowired
	private LoginDAO dao;

	public RegisterDTO validteUserService(LoginDTO dto) {
		System.out.println("loginService started...");

		RegisterDTO dtoFromDB = dao.fetchUser(dto);

		return dtoFromDB;

	}

	public List<RegisterDTO> fetchUserService() {
		System.out.println("loginService started...");

		List<RegisterDTO> dtoFromDB = dao.getAll();
		
		return dtoFromDB;

	}
}
