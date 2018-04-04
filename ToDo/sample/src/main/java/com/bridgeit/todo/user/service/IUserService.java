package com.bridgeit.todo.user.service;

import com.bridgeit.todo.user.model.User;

public interface IUserService {

	public int addUser(User user);
	public User validateUser(User user);

}
