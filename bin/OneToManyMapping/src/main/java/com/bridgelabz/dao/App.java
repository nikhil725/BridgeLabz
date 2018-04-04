package com.bridgelabz.dao;

import java.util.Set;
import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.model.Dept;
import com.bridgelabz.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	  Configuration c = new Configuration();
    	    c.configure("hibernate.cfg.xml");
    			
    	    SessionFactory sf=c.buildSessionFactory();
    			
    	    Session session = sf.openSession();
    	    Transaction trans = session.beginTransaction();
    							
    	    Employee emp1 = new Employee();
    	    emp1.setEmployeeId(1);
    	    emp1.setEmployeeName("Nikhil");
    	 
    	    Employee emp2 = new Employee();
    	    emp2.setEmployeeId(2);
    	    emp2.setEmployeeName("Pranav");
    		
    	    Employee emp3 = new Employee();
    	    emp3.setEmployeeId(3);
    	    emp3.setEmployeeName("Sai");
    	 
    	    Set <Employee> emps = new HashSet<Employee>();
    	    emps.add(emp1);   		              
    	    emps.add(emp2);
    	    emps.add(emp3);
    	 
    	    Dept dept = new Dept();
    	    dept.setDeptId(1234);
    	    dept.setDeptName("Production");
    	    dept.setEmployees(emps);  	            
    	    session.persist(dept);
    	    trans.commit();
    	    System.out.println("Records inserted");
    }
}
