package com.navi.mvcApp.controller.forgotpassword;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.navi.mvcApp.model.service.forgotpassword.ForgotService;

@Controller
@RequestMapping("/")
public class ForgotController {
	
	public ForgotController() {
		System.out.println(this.getClass().getSimpleName()+" created...");
	}

	@Autowired
	private ForgotService service;
	
	@RequestMapping(value="checkuid.do", method=RequestMethod.POST)
	public ModelAndView checkUserIdControlleer(@RequestParam String userid) {
		
		System.out.println("check userid controller started");
		String email=service.checkUserIdService(userid);
		
		if(email != null) {
			
			return new ModelAndView("redirect:reset.do?em="+email);
		}
		else {
			System.out.println("Invalid UserName");
			System.out.println("check userid controller ended");
			return new ModelAndView("Forgot.jsp","msg","user not exist or Invalid user");
		}
	}
	
	@RequestMapping(value="reset.do", method=RequestMethod.GET)
	public ModelAndView resetPasswordController(HttpServletRequest req) {
		
		System.out.println("resetPasswordController started... ");
		String email=req.getParameter("em");
		System.out.println(email);
		
		String password=service.resetPwdService(email);
		if(password!=null) {
			System.out.println("Reset Successful");
			
			String message="Reset password is success, check your email for latest password";
			
			System.out.println("resetPasswordController started... ");
			return new ModelAndView("Forgot.jsp","msg",message);
			
		}
		return null;
		
	}
}

