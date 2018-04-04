package com.bridgeit.todo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.todo.user.dao.IUserDao;
import com.bridgeit.todo.user.model.User;

public class UserServiceImpl implements IUserService{
	@Autowired
	IUserDao userDao;

	@Transactional
	public int addUser(User user) {
		
		return userDao.addUser(user);
	}
	
	public User validateUser(User user) {
		return userDao.validateUser(user);
	}

}
