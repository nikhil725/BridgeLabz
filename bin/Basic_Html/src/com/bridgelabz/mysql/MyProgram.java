package com.bridgelabz.mysql;
import java.io.Console;
import java.sql.*;
import java.util.Scanner;

public class MyProgram {


	public static void main(String[] args) throws SQLException {

		//Console console = null;
		try {
			
			Console console = System.console();
		
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter User name");
				String user = scanner.next();
			//	System.out.println("Enter password");
				char[] passString = console.readPassword();
				String pass = new String(passString );
//				String pass = scanner.next();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil_DB",user, pass);
			Statement statement = connection.createStatement();
			System.out.println("connection done");
			//	statement.executeUpdate("insert into emp23 values(3,'Sachin','Bandra')");
			//			ResultSet resultSet = statement.executeQuery("select * from emp23 where emp_Id=2");
			ResultSet resultSet = statement.executeQuery("select * from emp23");
			//			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
