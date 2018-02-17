package com.bridgelabz.mysql;
import java.io.Console;
import java.sql.*;
import java.util.Scanner;

public class MyProgram {


	public static void main(String[] args) throws SQLException {
			
		Scanner scanner = new Scanner(System.in);
				try {
					Class.forName("com.mysql.jdbc.Driver");
				
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil_DB","root", "root");
				Statement statement = connection.createStatement();
//				PreparedStatement preparedStatement = connection.prepareStatement("delete from emp23 where emp_ID = ?");
//				System.out.println("Enter emp_ID ");
//				int id = scanner.nextInt();
//				preparedStatement.setInt(1, id);
//				preparedStatement.executeUpdate();
				System.out.println("Delete Successfully");
				System.out.println("connection done");
				statement.addBatch("insert into emp23 values(5,'Rahul','Nashik',18520)");
				statement.addBatch("insert into emp23 values(6,'Ketan','Nagar',17220)");
				statement.addBatch("insert into emp23 values(7,'Sarang','Yeola',16520)");
				statement.executeBatch();
				//statement.executeUpdate("insert into emp23 values(4,'Pawan','Pune')");
										
				//			ResultSet resultSet = statement.executeQuery("select * from emp23 where emp_Id=2");
				//ResultSet resultSet = statement.executeQuery("select * from emp23");
				//
//				CallableStatement callableStatement = connection.prepareCall("{call pp1()}");
//				ResultSet resultSet = callableStatement.executeQuery();
				
//				while(resultSet.next()) {
//					System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
//				}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}

}
