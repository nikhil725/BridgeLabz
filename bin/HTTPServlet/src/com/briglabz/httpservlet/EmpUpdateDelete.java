package com.briglabz.httpservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpUpdateDelete extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empId = Integer.parseInt(req.getParameter("empid"));
		String empName = req.getParameter("empname");
		String empAdd = req.getParameter("empaddress");
		int empSalary = Integer.parseInt(req.getParameter("empsalary"));

		String action = req.getParameter("action");

		if(action.equals("Update")){


			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil_DB", "root", "root");
				PreparedStatement preparedStatement = connection.prepareStatement("update emp23 set emp_name=?,emp_Address=?,emp_Salary=? where emp_Id=?");
				preparedStatement.setString(1, empName);
				preparedStatement.setString(2, empAdd);
				preparedStatement.setInt(3, empSalary);
				preparedStatement.setInt(4, empId);
				preparedStatement.executeUpdate();
				System.out.println("Data updated successfully");
				resp.sendRedirect("display.jsp");
				/*RequestDispatcher dispatcher =req.getRequestDispatcher("display.jsp");
				dispatcher.include(req, resp);*/

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}


		}

		if(action.equals("Delete")){

			System.out.println("In delete method");

			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil_DB", "root", "root");
				PreparedStatement preparedStatement = connection.prepareStatement("delete from emp23 where emp_ID=?");
				preparedStatement.setInt(1, empId);
				preparedStatement.executeUpdate();
				System.out.println("data deleted successfully");
				resp.sendRedirect("index.html");


			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
	}
}
