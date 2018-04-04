package com.bridgeit.todo.user.service;

import javax.servlet.http.HttpServletRequest;

import com.bridgeit.todo.user.model.User;

public interface IUserService {

	public String addUser(User user, HttpServletRequest req);
	public User validateUser(User user);
	public User getUserByEmaiId(User user);
	public User getUserById(int id);
	public boolean forgotPassword(User user, HttpServletRequest req);
	public String activateUser(String randomId, HttpServletRequest request);
	public String resetPassword(HttpServletRequest request, User user, String randomId);
	boolean isEmailIdPresent(String emailId);

}
