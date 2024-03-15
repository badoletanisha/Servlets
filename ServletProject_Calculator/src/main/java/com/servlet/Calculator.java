package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Calculator  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1  = Integer.parseInt(req.getParameter("num1"));
		int num2  = Integer.parseInt(req.getParameter("num2"));
        int sum = num1 + num2;
        
		PrintWriter out = res.getWriter();
		out.print("<h1>Sum : " +sum+ "</h1>");
		
//	       int sub = num1 - num2;
//	        
//			PrintWriter out = resp.getWriter();
//			out.print("<h1>Subtract : " +sub+ "</h1>");
		
//		 int mul = num1 * num2;
//	        
//			PrintWriter out = resp.getWriter();
//			out.print("<h1>Multiplication : " +mul+ "</h1>");
			
//			 int div = num1 / num2;
//		        
//				PrintWriter out = resp.getWriter();
//				out.print("<h1>Division : " +div+ "</h1>");
		
//		int mod = num1 % num2;
//		PrintWriter out = res.getWriter();
//		out.print("<h1>Modulus : " +mod+ "</h1>");



		
	}
	
	
}