<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>My JSP</h1>
	<h1>
	<%
	out.print(request.getAttribute("data"));	
	%>
	</h1>
	<%
		out.print(request.getParameter("name"));
		out.print(request.getParameter("pass"));
		out.print(request.getParameter("address"));
	%>
</body>
</html>