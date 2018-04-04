package com.bridgelabz.MappingDeno.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	public SessionFactory getSessionFactory()
	{
		Configuration cfg =new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}

}
