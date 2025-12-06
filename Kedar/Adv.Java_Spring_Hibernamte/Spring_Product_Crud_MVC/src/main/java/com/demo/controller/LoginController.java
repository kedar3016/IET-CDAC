package com.demo.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.mysql.cj.Session;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService lservice;
	
	@GetMapping("/loginuser")
	public String showLogin() {
		return "loginpage";
	}
	
	@GetMapping("/validate")
	public ModelAndView ValidateUser(HttpSession session,@RequestParam("uname") String uname,@RequestParam("pass") String pass) {
		
		MyUser u = lservice.ValidateUser(uname,pass);
		
		if(u != null) {
			session.setAttribute("user",u);
			return new ModelAndView("redirect:/product/showproduct");
			
		}
		else {
			return new ModelAndView("loginpage","message","Invalid crenditials !!!");
		}
	}
	
	
	

}
