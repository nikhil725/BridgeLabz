package com.bridgelabz.User.main;

import java.util.List;
import java.util.Scanner;

import com.bridgelabz.User.dao.UserDAO;
import com.bridgelabz.User.dto.User;

/**
 * @purpose : This program is perform all CRUD operations. 
 * @author bridgeit
 *
 */
public class UserDemo {
	
	static Scanner in = new Scanner(System.in);

	public static User createUser(){
	
		User user = new User();
		System.out.println("Enter Name");
		String name = in.next();
		user.setName(name);
		
		System.out.println("Enter password");
		String pass = in.next();
		user.setPassword(pass);
		
		System.out.println("Enter Address");
		String add = in.next();
		user.setAddress(add);
		
		return user;
		
	}
	
	public static void main(String[] args) {
		
		UserDAO userDAO = new UserDAO();
		//Insert User
		
		System.out.println("Enter how may user you want to add");
		int user1 = in.nextInt();
		for(int i=0; i<user1; i++)
		{
			userDAO.insertUser(createUser());	
		}
	
		//Delete User

		System.out.println("Enter id to delete record");
		int id = in.nextInt();
		userDAO.deleteUser(id);
		System.out.println("Data delete...");
		
		//update user
		System.out.println("Enter user name to update");
		String name = in.next();
		System.out.println("Enter user Id where to update");
		int id1 = in.nextInt();
		userDAO.updateUser(name, id1);
		
		
		//Login user
		System.out.println("Enter username and password to loggin");
		System.out.println("Enter user name");
		String username = in.next();
		
		System.out.println("Enter user password");
		String pass = in.next();
		
		User user = userDAO.loginUser(username, pass);
		
		if(user!=null)
		{	
			System.out.println("User Found");
			System.out.println(user.getId()+", "+user.getName()+", "+user.getAddress());
			
		}else
		{
			System.out.println("Wrong UserName or Password...");
		}
		
		//show user details
		List<User> users = userDAO.showUserDetails();
		System.out.println("All Details of user:");
		for(User user2 : users){
			System.out.println(user2);
			
		}
	
		
	}
}
