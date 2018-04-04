package com.bridgeit.todo.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.todo.user.model.User;
import com.bridgeit.todo.user.service.IUserService;

@RestController
public class UserController {

	@Autowired
	IUserService userService;

	
		
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ResponseEntity<String> registerUser(@RequestBody User user, HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("In side register...");
		
		if (userService.isEmailIdPresent(user.getEmail())) {
			
			return new ResponseEntity<String>("this email id already register...try with another",HttpStatus.CONFLICT);
			
		} else {
		
		if(userService.addUser(user, req)!=null)
		{
			return new ResponseEntity<String>("User Registration fail..", HttpStatus.CONFLICT);
		}
		
		//user.setName("xyz");

		return new ResponseEntity<String>("User Registered..", HttpStatus.OK);
		}
	}
	

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ResponseEntity<String> loginUser(@RequestBody User user, HttpServletRequest request) {
			
			System.out.println("In login api");
			User user2 = userService.getUserByEmaiId(user);
			
			System.out.println("plainText " +user.getPassword());
			System.out.println("hashCode " +user2.getPassword());

			System.out.println("successfull");
			

		 if(user2!=null && BCrypt.checkpw(user.getPassword(), user2.getPassword()) == true)
		 {
				return new ResponseEntity<String>("Login Successful1", HttpStatus.OK);
		 }
			
		/*try {
			
			User user2 =  userService.validateUser(user);
			
						  userService.getUserById(user2.getId());
			
			if ( user2 != null) {

				HttpSession session = request.getSession();
				session.setAttribute("nameid", user2);
				return new ResponseEntity<String>("Login Successful", HttpStatus.OK);
			}

		} catch (Exception e) {
			
			return new ResponseEntity<String>("Invalid username or password... ", HttpStatus.NOT_FOUND);
			
		}*/
		return new ResponseEntity<String>("Invalid username or password...", HttpStatus.NOT_FOUND);
			
	}
	
	@RequestMapping(value = "getUserById/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable("id") int id) {
		
		try {
			System.out.println("In getuser");
			User userInformtion = userService.getUserById(id);
			
			System.out.println(userInformtion.getName()+".."+userInformtion.getEmail()+"...."+userInformtion.getPassword());
			return new ResponseEntity<User>(userInformtion, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<User>(HttpStatus.CONFLICT);
		}
		
	}
	
	@RequestMapping(value = "getUserByEmailId", method = RequestMethod.POST)
	public ResponseEntity<String> getUserByEmail(@RequestBody User user) {
		
		
		try {
			System.out.println("In getuser");
			User userInformtion = userService.getUserByEmaiId(user);
			
			System.out.println(userInformtion.getName()+".."+userInformtion.getEmail()+"...."+userInformtion.getPassword());
			return new ResponseEntity<String>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(value = "/activateUser/{randomId}", method = RequestMethod.GET)
	public ResponseEntity<Void> activate(@PathVariable("randomId") String randomId,  HttpServletRequest request,
			HttpServletResponse response)  {
		
		userService.activateUser(randomId, request); 
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/forgotPassword", method = RequestMethod.POST)
	public ResponseEntity<Void> forgotPassword(@RequestBody User user, HttpServletRequest request) {
		try {
			if (userService.forgotPassword(user, request)) {
				return new ResponseEntity<Void>(HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
	
	@RequestMapping(value = "/resetPassword/{randomId}", method = RequestMethod.POST)
	public ResponseEntity<Void> resetPasswowrd(@PathVariable("randomId") String randomId, HttpServletRequest request, @RequestBody User user)  {
		
		userService.resetPassword(request, user, randomId);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
}
