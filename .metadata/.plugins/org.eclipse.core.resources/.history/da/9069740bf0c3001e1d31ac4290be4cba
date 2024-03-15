<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ResultSet rs =(ResultSet)request.getAttribute("displayAllMobile");
%>
<table border ="">
 <tr>
 <th>mobileId</th>
 <th>mobile_model</th>
 <th>mobile_brand</th>
 <th>mobile_price</th>
 
 </tr>
 <%
 while(rs.next()){
 %>
 <tr>
   <td><%= rs.getInt("mobileId") %></td>
   <td><%= rs.getString("mobile_model") %></td>
   <td><%= rs.getString("mobile_brand") %></td>
   <td><%= rs.getInt("mobile_price") %></td>
 
 </tr>
</table>
</body>
</html>