package com.bridgeit.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.user.dao.IUserDao;
import com.bridgeit.user.model.User;

public class UserServiceImpl implements IUserService {


	@Autowired
	IUserDao userDao;
	public int addUser(User user) {
		return userDao.addUser(user);
	}

}
