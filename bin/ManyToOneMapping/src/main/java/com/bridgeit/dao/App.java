package com.bridgeit.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Department;
import com.bridgeit.model.Employee;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();
		
		Employee employee = new Employee(1, "nikhil");
		Employee employee2 = new Employee(2, "Pranav");
		
		Set<Employee> emps = new HashSet<Employee>();
		emps.add(employee);
		emps.add(employee2);
		
		Department department = new Department();
		department.setDepartName("IT");
		
		
	}
}
