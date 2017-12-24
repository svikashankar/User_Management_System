package com.navi.mvcApp.model.service.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.mvcApp.dto.register.RegisterDTO;
import com.navi.mvcApp.model.dao.register.RegisterDAO;

@Service
public class RegisterService {

	@Autowired
	private RegisterDAO dao;

	public RegisterService() {
		System.out.println(this.getClass().getSimpleName() + " created..");
	}
	
	public void registerService(RegisterDTO dto) {
		
		System.out.println("calling create in service..." + dto);
		if (dto != null) {
			System.out.println("Valid data can call dao");
			dao.save(dto);
			return;
		}
		System.out.println("invalid data , cannot call dao");
	}
}
