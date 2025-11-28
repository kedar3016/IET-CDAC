package com.demo.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.*;

public class ForgotPassServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		String email = req.getParameter("email");
		String oldPass = req.getParameter("oldpass");
		String newPass = req.getParameter("newpass");
		String cnfPass = req.getParameter("cnfpass");
		
		if(oldPass.equals(newPass)) {
			req.setAttribute("error","Old Password and new Password Not a Same!!");
			RequestDispatcher rd = req.getRequestDispatcher("ForgotPass.html");
			rd.include(req, res);
			
			
		}
		else if(newPass.equals(cnfPass)) {
			
			ForgotPassService fpservice = new ForgotPassServiceImpl();
			fpservice.changePass(email,newPass);
		}
		
		
	}

}
