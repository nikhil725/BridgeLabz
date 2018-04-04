package com.bridgeit.dao;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

import com.bridgeit.model.Course;
import com.bridgeit.model.Student;

public class InsertData {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
	    c.configure("hibernate.cfg.xml"); 
	    SessionFactory sf = c.buildSessionFactory();
	    Session s = sf.openSession();        
			 
	    Student std1 = new Student();
	    std1.setStudentId((short)100);
	    std1.setStudentName("S N Rao");
	    std1.setMarks((short)45);
			 
	    Student std2 = new Student();
	    std2.setStudentId((short)101);
	    std2.setStudentName("Jyostna");
	    std2.setMarks((short)75);
			 
	    Course course1 = new Course();
	    course1.setCourseId((short) 1234);
	    course1.setCourseName("Java");
	    course1.setDuration("60 days");
			 
	    Course course2 = new Course();
	    course2.setCourseId((short) 5678);
	    course2.setCourseName("Spring");
	    course2.setDuration("30 days");
			 
	    Set set1 = new HashSet();
	    set1.add(course1);
	    set1.add(course2);
			 
	    std1.setCourses(set1);
	    std2.setCourses(set1);
			 
	    Transaction tx = s.beginTransaction();
	    s.save(std1);   s.save(std2);
			 
	    tx.commit();
	    s.close();  sf.close();
	    System.out.println("Many To Many is over.");
	}

}
