package com.bridgeit.todo.user.dao;

import com.bridgeit.todo.user.model.User;

public interface IUserDao {

	public int addUser(User user);
	public User validateUser(User user);
}
