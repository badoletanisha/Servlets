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

public class AddStudent extends  GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String id= req.getParameter("id");
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String address = req.getParameter("address");
	
//	database connection
	
	String username = "root";
	String password = "root";
	
//	sql query
String sql = "Insert into student_database.student Values(?,?,?,?)"	;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
	PreparedStatement p = con.prepareStatement(sql);
	
	p.setString(1, id);
	p.setString(2, name);
	p.setString(3, email);
	p.setString(4, address);
	p.executeUpdate();
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

PrintWriter out	= res.getWriter();
out.println("stored succesfully");









//	out.print("<h1> " +" "+id+ "</ h1>");
//	out.print("<h1> " +" "+name+ "</ h1>");
//	out.print("<h1> " +" "+email+ "</ h1>");
//	out.print("<h1> " +" "+address+ "</ h1>");
	}

}
