package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
		String name= req.getParameter("name");
		PrintWriter out	= res.getWriter();
		out.print("<h1> " +"welcom "+name+ "</ h1>");


		

	}
	
////java book code 
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		res.setContentType("");
//		PrintWriter pw =res.getWriter();
//		pw.println("hello tanisha");
//		pw.close();
//	}



}
