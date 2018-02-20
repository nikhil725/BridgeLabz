package com.bridgeit.mylogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginPage extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("In servlet");
		PrintWriter printWriter = res.getWriter();
		String username=req.getParameter("name");
		String pass = req.getParameter("pass");
		printWriter.print("My First Servlet");
	}
}
