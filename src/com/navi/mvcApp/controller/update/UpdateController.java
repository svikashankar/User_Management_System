package com.navi.mvcApp.controller.update;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.navi.mvcApp.dto.register.RegisterDTO;
import com.navi.mvcApp.model.service.update.UpdateService;

@Controller
@RequestMapping("/")
public class UpdateController {

	public UpdateController() {
		System.out.println(this.getClass().getSimpleName() + " created...");
	}

	@Autowired
	private UpdateService service;

	@RequestMapping(value="update.do",method=RequestMethod.POST)
	public ModelAndView updateUserController(RegisterDTO dto, HttpServletRequest req) {

		System.out.println("callling updateUserController....");

		HttpSession session = req.getSession(false);
		RegisterDTO dtoFromSession = (RegisterDTO) session.getAttribute("dto");
		int id=dtoFromSession.getId();
		dto.setId(id);
		
		RegisterDTO dtoFromDB=service.updateUserService(dto);
		session.setAttribute("dto", dtoFromDB);
		
		System.out.println("RDTO->" + dtoFromSession);
		return new ModelAndView("Home.jsp", "msg", "updated successful");

	}
}
