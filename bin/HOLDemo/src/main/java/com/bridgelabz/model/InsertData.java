package com.bridgelabz.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Student student = new Student();
		student.setRollNo(101);
		student.setName("Nikhil");
		student.setAddress("Mumabi");
		
		Student student2 = new Student();
		student2.setRollNo(102);
		student2.setName("Shyam");
		student2.setAddress("Thane");
		Transaction txn = session.beginTransaction();
		session.save(student);
		session.save(student2);
		System.out.println("Object saved successfully....");
		txn.commit();
		session.close();
		factory.close();
	}
}
