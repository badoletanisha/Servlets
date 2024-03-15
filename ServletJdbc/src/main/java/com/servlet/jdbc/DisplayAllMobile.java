package com.servlet.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;
@WebServlet("/displayAllMobile")
public class DisplayAllMobile extends HttpServlet {
	protected void doGet(HttpServletRequest req ,HttpServletResponse resp) {
		String Query = "Select * from servletjdbc.mobile";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement statement = (Statement) con.createStatement();
		ResultSet rs =((java.sql.Statement) statement).executeQuery(Query);
		req.setAttribute("displayAllMobile", rs);
		RequestDispatcher dispatcher = req.getRequestDispatcher("displayAllMobile.jsp");
		dispatcher.forward(req, resp);
		} catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	


