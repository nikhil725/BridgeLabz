package com.briglabz.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		/*String name = request.getParameter("name");
		String password = request.getParameter("pass");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("my name" + name);
		printWriter.print("my Password" + password);*/
		response.sendRedirect("wellcome.html");
	}
}
