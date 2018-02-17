package com.bridgelabz.mysql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {
	
	public static void main(String[] args) throws SQLException, IOException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil_DB","root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into emp23 values(?,?,?,?)");
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
			
			System.out.println("Enter emp_Id");
			String str1 = bufferedReader.readLine();
			int id = Integer.parseInt(str1);
			
			System.out.println("Enter Emp_name");
			String empName = bufferedReader.readLine();
			
			System.out.println("Enter Emp address");
			String empAddress = bufferedReader.readLine();
			
			System.out.println("Enter Emp Salary");
			String str2 = bufferedReader.readLine();
			int empSalary = Integer.parseInt(str2);
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, empName);
			preparedStatement.setString(3, empAddress);
			preparedStatement.setInt(4, empSalary);
			
			preparedStatement.addBatch();
			System.out.println("want to add more records...Yes/No");
			String ans = bufferedReader.readLine();
			if(ans.equals("No")) {
			
				break;
			}
			
			}
		int[] count =	preparedStatement.executeBatch();
		System.out.println("The count is "+count.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
