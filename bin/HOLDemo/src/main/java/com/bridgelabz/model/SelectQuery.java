package com.bridgelabz.model;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectQuery {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("from Student");
		List<Student> list = query.getResultList();

		for (Student st : list) {
			System.out.println("List of Employees::"  + st.getName() );
		}
	}

}
