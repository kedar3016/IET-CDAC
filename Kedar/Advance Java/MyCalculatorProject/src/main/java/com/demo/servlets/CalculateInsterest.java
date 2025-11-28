package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateInsterest extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		double p = Double.parseDouble(req.getParameter("p1"));
		int n = Integer.parseInt(req.getParameter("y1"));
		float r = Float.parseFloat(req.getParameter("r1"));
		
		double ans = (p*r*n)/100;
		
		out.println("<h2>Interest : "+ans+"</h2>");
		
	}

}
