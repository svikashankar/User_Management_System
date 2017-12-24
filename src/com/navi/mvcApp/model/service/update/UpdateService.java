package com.navi.mvcApp.model.service.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.mvcApp.dto.register.RegisterDTO;
import com.navi.mvcApp.model.dao.update.UpdateDAO;

@Service
public class UpdateService {

	public UpdateService() {
		System.out.println(this.getClass().getSimpleName() + " created...");
	}

	@Autowired
	public UpdateDAO dao;


	
	public RegisterDTO updateUserService(RegisterDTO dto) {

		System.out.println("update user Details service method started...");

		dao.save(dto);
		
		return dto;
	}
}
