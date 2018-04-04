package com.bridgeit.user.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.user.model.User;

public class UserDaoImpl implements IUserDao {

	@Autowired
	private SessionFactory mySessionFactory;

	public int addUser(User user) {
		Session session = mySessionFactory.getCurrentSession();
		int id = (Integer) session.save(user);
		return id;

	}

}
