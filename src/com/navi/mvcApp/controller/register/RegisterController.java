package com.navi.mvcApp.controller.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.navi.mvcApp.dto.register.RegisterDTO;
import com.navi.mvcApp.model.service.register.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController {

	@Autowired
	private RegisterService service;

	public RegisterController() {
		System.out.println(this.getClass().getSimpleName() + " created..");
	}

	@RequestMapping(value = "register.do", method = RequestMethod.POST)
	public ModelAndView registerService(RegisterDTO dto) {
		System.out.println("calling register \t" + dto);

		service.registerService(dto);
		
		return new ModelAndView("Login.jsp", "successMessage",
				"Registration is Success, Please login " + dto.getUsername());
	


	}

}
