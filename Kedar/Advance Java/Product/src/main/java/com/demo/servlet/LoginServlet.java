package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.MyUser;
import com.demo.service.*;


public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		LoginService lservice = new LoginServiceImpl();
		MyUser user = lservice.validateUser(uname,pass);
	
		if(user != null) {
			out.println("<h1>Valid User</h1>");
		}
		else {
			out.println("<h1>Invalid User</h1>");
		}
	}
}
