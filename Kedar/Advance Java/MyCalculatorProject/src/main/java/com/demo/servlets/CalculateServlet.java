package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String btn = req.getParameter("btn");
		int num1 = Integer.parseInt(req.getParameter("num1"));
		
		switch(btn) {
		
				case "add" ->{
					int num2 = Integer.parseInt(req.getParameter("num2"));
					int ans = num1 + num2;
					out.println("<h2>Addition : "+ans+"</h2>");
				}
				
				case "sub" ->{
					int num2 = Integer.parseInt(req.getParameter("num2"));
					int ans = num1 - num2;
					out.println("<h2>Substration : "+ans+"</h2>");
					
				}
				
				case "fact"->{
					double fact = factorial(num1);
					out.println("<h2>Factorial : "+fact+"</h2>");
				}
		}
		
	
		
	}

	private double factorial(int num1) {
		double fact =1;
		
		for(int i = 1;i<=num1;i++) {
			fact*=i;
		}
		
		return fact;
	}
}
