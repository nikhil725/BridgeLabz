package com.bridgelabz.MappingDeno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 	
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory factory = configuration.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Student student = new Student(0, "Nikhil");
    	Address address = new Address("301", "Belapur road", "Belapur CBD", student);
    	
    	session.save(address);
    	session.flush();
    	transaction.commit();
    	System.out.println("Successfully update");
    }
}
