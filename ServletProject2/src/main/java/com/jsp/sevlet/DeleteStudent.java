package com.jsp.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DeleteStudent extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String n= req.getParameter("id");
		int id = Integer.parseInt("n");
		
		PrintWriter out	= res.getWriter();
		 out.print(id);
		 
		
	}

}
