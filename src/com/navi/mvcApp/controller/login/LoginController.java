package com.navi.mvcApp.controller.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.navi.mvcApp.dto.login.LoginDTO;
import com.navi.mvcApp.dto.register.RegisterDTO;
import com.navi.mvcApp.model.service.login.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	public LoginController() {
		System.out.println(this.getClass().getSimpleName() + " created..");
	}

	@Autowired
	private LoginService service;

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public ModelAndView validateUserContorller(LoginDTO dto, HttpServletRequest req) {

		System.out.println("login controller started.... ");

		RegisterDTO dtoFromDB = service.validteUserService(dto);

		if (dtoFromDB != null) {

			HttpSession session = req.getSession(true);
			session.setAttribute("dto", dtoFromDB);

			if (dtoFromDB.getRole() == 0) {
				System.out.println("Login success as admin....");

				System.out.println("User controller started.... ");

				List<RegisterDTO> dtoFromDB1 = service.fetchUserService();
				for (RegisterDTO registerDTO : dtoFromDB1) {
					System.out.println(registerDTO);
				}

				return new ModelAndView("AdminPage.jsp", "UserData", dtoFromDB.getUserid());
			}

			if (dtoFromDB.getRole() == 1) {

				System.out.println("Login Success");

				return new ModelAndView("Home.jsp", "name", dtoFromDB.getUsername());
			}

		} else {
			return new ModelAndView("Login.jsp", "msg", "userid or password is wrong.....");
		}
		return null;

	}
}