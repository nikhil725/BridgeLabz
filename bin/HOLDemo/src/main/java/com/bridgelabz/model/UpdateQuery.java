package com.bridgelabz.model;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateQuery {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Query query = session.createQuery("update Student set name= :name where id= :id");
        query.setParameter("name", "Rajeer");
        query.setParameter("id", 1);
        query.executeUpdate();
        System.out.println("Data updated successfully");
        
	}

}
