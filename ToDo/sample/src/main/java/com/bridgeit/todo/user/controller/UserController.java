package com.bridgeit.todo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> registerUser(@RequestBody User user) {

		userService.addUser(user);

		return new ResponseEntity<String>("User Registered..", HttpStatus.OK);
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ResponseEntity<String> loginUser(@RequestBody User user) {
		
		try {

			if (userService.validateUser(user) != null) {

				return new ResponseEntity<String>("Login Successful", HttpStatus.OK);
			}

		} catch (Exception e) {
			return new ResponseEntity<String>("Invalid username or password... ", HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<String>("Login Successful", HttpStatus.OK);

	}

}
