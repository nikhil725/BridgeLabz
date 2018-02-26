package com.bridgelabz.MavenDemo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    	
    	System.out.println(new Date().getTime());
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	 Session session = factory.getCurrentSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	Employee employee = new Employee();
    	employee.setId(101);
    	employee.setFirstName("Nikhil");
    	employee.setLastName("Vaidya");
    	
    	Employee employee2 = new Employee();
    	employee2.setId(102);
    	employee2.setFirstName("Sanket");
    	employee2.setLastName("Pagare");
    	
    	session.persist(employee);
    	session.persist(employee2);
    	
    	transaction.commit();
    	session.close();
    	System.out.println("Record updated Successfully");
    }
}
