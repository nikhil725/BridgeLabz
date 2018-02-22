<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="Cornsilk">
<table border="1">
	<%
		String name = request.getParameter("search");
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil_DB", "root","root");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from emp23 where emp_name=?");
		preparedStatement.setString(1, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			
		
	%>
	<tr>
	<td>Emp Id</td>
	<td>Emp Name</td>
	<td>Emp Address</td>
	<td>Emp Salary</td>
	</tr>
	
	<tr>
	<td><%=resultSet.getInt(1) %></td>
	<td><%=resultSet.getString(2)%></td>
	<td><%=resultSet.getString(3)%></td>
	<td><%=resultSet.getInt(4) %></td>
	</tr>
	<%} %>
</table>
</body>
</html>