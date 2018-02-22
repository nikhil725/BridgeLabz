<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function validation() {
		for (var i = 0; i < document.myform.count.value; i++) {

			if (document.myform.check[i].checked) {
				document.myform.empid[i].disabled = false;
				document.myform.empname[i].disabled = false;
				document.myform.empaddress[i].disabled = false;
				document.myform.empsalary[i].disabled = false;
			}
			if (!document.myform.check[i].checked) {
				document.myform.empid[i].disabled = true;
				document.myform.empname[i].disabled = true;
				document.myform.empaddress[i].disabled = true;
				document.myform.empsalary[i].disabled = true;
			}
		}

	}
</script>
</head>

<body bgcolor="Cornsilk">
	<form name="myform" action="EmpUpdateDelete" method="post">
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
				int count=0;
				while (resultSet.next()) {
					count++;
			%>
			<tr>
				<td><input type="checkbox" name="check" value="<%=resultSet.getInt(1)%>" onclick="validation()">
				<td><input type="text" name="empid" disabled="true" value="<%=resultSet.getInt(1)%>"></td>
				<td><input type="text" name="empname" disabled="true" value="<%=resultSet.getString(2)%>"></td>
				<td><input type="text" name="empaddress" disabled="true" value="<%=resultSet.getString(3)%>"></td>
				<td><input type="text" name="empsalary" disabled="true" value="<%=resultSet.getInt(4)%>"></td>
			</tr>
					
			<%
				}
			%>
		</table>
		</center>
            <center>
            <input type="hidden" name="count" value="<%=count%>"/> 
            <input type="submit" name="action" value="Update"/>
            <input type="submit" name="action" value="Delete"/>
            </center> 
		<br>
		<br>
	</form>
</body>
</html>