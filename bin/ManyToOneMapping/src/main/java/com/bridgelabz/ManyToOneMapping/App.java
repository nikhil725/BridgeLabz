package com.bridgelabz.ManyToOneMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     Configuration configuration = new Configuration();
     configuration.configure("hibernate.cfg.xml");
     SessionFactory factory = configuration.buildSessionFactory();
     Session session = factory.openSession();
     
     Transaction transaction = session.getTransaction();
     transaction.begin();
     Employee employee = new Employee();
     employee.setEmployeeId(1);
     employee.setEmployeeName("Nikhil");
     
     Employee employee2 = new Employee();
     employee2.setEmployeeId(2);
     employee2.setEmployeeName("Pranav");
     
     Set<Employee> emp = new HashSet<Employee>();
     emp.add(employee);
     emp.add(employee2);
     
     Department department = new Department();
     department.setDeptId(1);
     department.setDepartName("IT");
     department.setEmplyoees(emp);
     
     session.persist(department);
     transaction.commit();
     System.out.println("Record Updated Successfully ");
    }
}
