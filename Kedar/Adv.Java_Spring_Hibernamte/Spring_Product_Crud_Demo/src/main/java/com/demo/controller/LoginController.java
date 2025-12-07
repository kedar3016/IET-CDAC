package com.demo.controller;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService lservice;
	
	@GetMapping("/loginuser")
	public String showLoginForm() {
		return "login";
	}
	
	
	@PostMapping("/validateUser")
	public ModelAndView validateUser(HttpSession session,@RequestParam("uname") String uname,@RequestParam("pass") String pass) {
		MyUser user = lservice.validateUser(uname,pass);
		
		if(user != null) {
			session.setAttribute("user", user);
			 return new ModelAndView("redirect:/product/showproduct");
		}
		else {
			return new ModelAndView("login","msg","Invalid crenditials!!!");
		}
	}

}
