package com.bridgelabz.mysql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetadataDemo {

	public static void main(String[] args) throws SQLException {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil_DB","root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from emp23");
			ResultSet resultSet = preparedStatement.executeQuery();
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			DatabaseMetaData databaseMetaData = connection.getMetaData(); 	
			
			
			System.out.println("Total columns: "+resultSetMetaData.getColumnCount());
			System.out.println("Column name of 1st column "+resultSetMetaData.getColumnName(1));
			
			System.out.println("Driver Name : "+databaseMetaData.getDriverName());
			System.out.println("Driver Version : "+databaseMetaData.getDriverVersion());
			System.out.println("User Name : "+databaseMetaData.getUserName());
			System.out.println("Database Product Name: "+databaseMetaData.getDatabaseProductName());  
			System.out.println("Database Product Version: "+databaseMetaData.getDatabaseProductVersion());  
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
