package com.bridgeit.config;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.bridgeit.dto.Employee;

public class CriteriaDemo {

public static void main(String[] args) {
	
	
	Configuration configuration = new Configuration();
	configuration.configure("Hibernate.cfg.xml");
	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.getCurrentSession();
	Transaction transaction = session.beginTransaction();

	Criteria criteria = session.createCriteria(Employee.class);
	Criterion criterion = Restrictions.gt("empId", new Double(14500.00));
//	Criterion criterion = Restrictions.like("empName", "N");
	criteria.add(criterion);
	List list = criteria.list();
	System.out.println("Total size of list "+list.size());
	
	Iterator iterator = list.iterator();
	
	while(iterator.hasNext()){
		
		Employee employee = (Employee) iterator.next();
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAddress());
		System.out.println(employee.getEmpSalary());
		
	}
	
	factory.close();
}
}
