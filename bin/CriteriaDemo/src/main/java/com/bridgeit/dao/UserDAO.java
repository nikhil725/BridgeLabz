package com.bridgeit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bridgeit.config.HibernateConfig;

public class UserDAO {
	
	HibernateConfig config = new HibernateConfig();
	SessionFactory factory = config.getSessionFactory();
	Session session = null;

}
