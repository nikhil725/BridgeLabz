package com.briglabz.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		/*String name = request.getParameter("name");
		String password = request.getParameter("pass");
		String address = request.getParameter("address");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("my name "+ name);
		printWriter.print("my Password "+ password);
		printWriter.print("my address "+ address);
		String str = "Welcome In IT";
*/

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil_DB", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from emp23");
			ResultSet resultSet = preparedStatement.executeQuery();

			request.setAttribute("rs", resultSet);
			RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
			dispatcher.forward(request, response);
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
