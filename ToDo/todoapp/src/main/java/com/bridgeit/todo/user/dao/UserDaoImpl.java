package com.bridgeit.todo.user.dao;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.todo.user.model.User;



public class UserDaoImpl implements IUserDao {

	@Autowired
	private SessionFactory mySessionFactory;

	public int addUser(User user) {
		Session session = mySessionFactory.openSession();
		int id = (Integer) session.save(user);
		return id;

	}

	public User validateUser(User user) {

		Session session = mySessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		Criterion id = Restrictions.eq("name", user.getName());
		Criterion password = Restrictions.eq("password", user.getPassword());
		Criterion criterion = Restrictions.and(id, password);
		criteria.add(criterion);

		User user1 = (User) criteria.uniqueResult();
		System.out.println(user1.getName()+"..."+user1.getPassword());
		return user1;


	}

}
