package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.*;
import com.demo.service.*;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String role = request.getParameter("role");
		String pass = request.getParameter("pass");
		String address = request.getParameter("add");
		String dob1 = request.getParameter("dob");
		LocalDate dob = LocalDate.parse(dob1,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String gender = request.getParameter("gen");
		
		String hobbyArray[] =request.getParameterValues("hobby");
		String hobbies = (hobbyArray != null) ? String.join(", ", hobbyArray) : "";
		
		String locArray[] = request.getParameterValues("loc");
		String locations = (locArray != null) ? String.join(", ", locArray) : "";
		
		NewUser user = new NewUser(uname,email,role,pass,address,dob, gender,hobbies,locations);	
		
		LoginService lservice = new LoginServiceImpl();
		
		Boolean status = lservice.addNewUser(user);
		
		if(status) {
			out.println("User Added Succefully");
			RequestDispatcher rs = request.getRequestDispatcher("Login.html");
			rs.forward(request, response);
		}
		else {
			out.println("<h3>Something Went Wrong!!</h3>");
			RequestDispatcher rs = request.getRequestDispatcher("RegisterForm.html");
			rs.include(request, response);
		}
		
	}

}
