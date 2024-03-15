package com.jsp.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UpdateStudent extends GenericServlet {
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String i= req.getParameter("id");
		String address = req.getParameter("address");
//		PrintWriter out	= res.getWriter();
//		 out.print(id);
//		 out.print(address);
		 
//			database connection
			
			String username = "root";
			String password = "root";
			
//			sql query
		String sql = "UPDATE student_database.student Set address ='?' where id ='?'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement p = con.prepareStatement(sql);
			
			p.setString(1, i);
			p.setString(2, address);
			p.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintWriter out	= res.getWriter();
		out.print("stored succesfully");


		
	}
	
	}

