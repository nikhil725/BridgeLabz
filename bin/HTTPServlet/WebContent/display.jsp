<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<tr>
		<td></td>
		<td>empID</td>
		<td>emp Name</td>
		<td>emp Address</td>
		<td>emp Salary</td>
	</tr>

	<%
		ResultSet resultSet = (ResultSet) request.getAttribute("rs");
		while (resultSet.next()) 
		{
	%>

	<tr>
	<td><input type="checkbox">
		<td><input type="text" value="<%=resultSet.getInt(1)%>"></td>
		<td><input type="text" value="<%=resultSet.getString(2)%>"></td>
		<td><input type="text" value="<%=resultSet.getString(3)%>"></td>
		<td><input type="text" value="<%=resultSet.getInt(4)%>"></td>
	</tr>	
	<%} %>
	</table><br><br>
	<form action="">
	<input type="submit" value="Update">
	</form>
	<form action="">
	<input type="submit" value="Delete">
	</form>
</body>
</html>