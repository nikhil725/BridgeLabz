package com.bridgelabz.mysql;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionDemo {

	public static void main(String[] args) throws SQLException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil_DB","root", "root");
			
			connection.setAutoCommit(false);
			PreparedStatement preparedStatement = connection.prepareStatement("insert into emp23 values(?,?,?,?)");
			
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
			
			System.out.println("Enter emp_Id");
			String str1 = scanner.next();
			int id = Integer.parseInt(str1);
			
			System.out.println("Enter Emp_name");
			String empName = scanner.next();
			
			System.out.println("Enter Emp address");
			String empAddress = scanner.next();
			
			System.out.println("Enter Emp Salary");
			String str2 = scanner.next();
			int empSalary = Integer.parseInt(str2);
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, empName);
			preparedStatement.setString(3, empAddress);
			preparedStatement.setInt(4, empSalary);
			
			System.out.println("commit/rollback");  
			String answer=scanner.next();  
			preparedStatement.executeUpdate();

			if(answer.equals("commit"))
			{  
				connection.commit();  

			}  
			if(answer.equals("rollback"))
			{  
				connection.rollback();  
			}  
	
			System.out.println("want to add more records...Yes/No");
			String ans = scanner.next();
			if(ans.equals("No")) {
			
				break;
			}
			
			}
			connection.commit();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
