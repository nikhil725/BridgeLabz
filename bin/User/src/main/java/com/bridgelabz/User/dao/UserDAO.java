	package com.bridgelabz.User.dao;

import java.util.List;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.bridgelabz.User.dto.User;
import com.brigelabz.User.config.HibernateConfig;

public class UserDAO {

	HibernateConfig config = new HibernateConfig();
	SessionFactory factory = config.getSessionFactory();
	Session session = null;

	/**
	 * This method used for to insert the record
	 * @param user
	 */
	public void insertUser(User user){ 
		session = factory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		System.out.println("Data updated...");
	}

	/**This method used to update the record
	 * @param name
	 * @param id
	 * @return
	 */
	public int updateUser(String name, int id){

		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update User set name =:name where id = :id");

		query.setParameter("name", name);
		query.setParameter("id", id);
		int result = query.executeUpdate();		
		transaction.commit();
		session.close();
		return result;
	}

	/**This method used to display all records
	 * @return
	 */
	public List<User> showUserDetails(){

		session=factory.openSession();

		Query query = session.createQuery("from User");

		List<User> list = query.getResultList();
		return list;
	}

	/**This method is used to delete record
	 * @param id
	 * @return
	 */
	public int deleteUser(int id){

		session=factory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete from User where id = :id");
		query.setParameter("id", id);
		int result = query.executeUpdate();
		return result;

	}

	/**
	 * This method is used to display particular user information
	 * @param userName
	 * @param pass
	 * @return
	 */
	public User loginUser(String userName, String pass){

		session=factory.openSession();
		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(User.class);
		Criterion id = Restrictions.eq("name", userName);
		Criterion password = Restrictions.eq("password", pass);
		Criterion criterion = Restrictions.and(id, password);
		criteria.add(criterion);

		User user = (User) criteria.uniqueResult();
		return user;
	}
}
