package com.bridgelabz.model;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteQuery {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Query query = session.createQuery("delete from Student where id= :id");
        query.setParameter("id", 2);
        int result = query.executeUpdate();
        
        System.out.println("Student data deleted successfully "+result);
        
	}
}
