package com.navi.mvcApp.controller.changepwd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.navi.mvcApp.dto.changepwd.ChangePwdDTO;
import com.navi.mvcApp.dto.register.RegisterDTO;
import com.navi.mvcApp.model.service.changepwd.ChangePwdService;

@Controller
@RequestMapping("/")
public class ChangePwdController {
	
	public ChangePwdController() {
		System.out.println(this.getClass().getSimpleName()+" created...");
	}
	
	@Autowired
	private ChangePwdService service;
	
	@RequestMapping(value="changepwd.do",method=RequestMethod.POST)
	public ModelAndView changePwdByUseridController(ChangePwdDTO cdto,HttpServletRequest req) {
		
		System.out.println("callling changePwdByUseridController....");
		
		HttpSession session=req.getSession(false);
		RegisterDTO dtoFromSession=(RegisterDTO)session.getAttribute("dto");
		System.out.println("CDto->"+dtoFromSession);
		String message=service.passwordService(cdto, dtoFromSession);
		return new ModelAndView("Home.jsp","msg",message);
		
	
	}
	

}
