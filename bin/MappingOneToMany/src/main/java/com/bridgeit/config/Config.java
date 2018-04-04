package com.bridgeit.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {
	private SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;

	}

}
