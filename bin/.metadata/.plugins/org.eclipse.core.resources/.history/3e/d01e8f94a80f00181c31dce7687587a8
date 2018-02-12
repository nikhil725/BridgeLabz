package com.bridgelabz.singletonpattern;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {
	 public static void main(String[] args)
	    {
	        Singleton instance1 = Singleton.instance;
	        Singleton instance2 = null;
	        try
	        {
	            Constructor[] constructors = 
	                    Singleton.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) 
	            {
	                // Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instance2 = (Singleton) constructor.newInstance();
	                break;
	            }
	        }
	     
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	         
	       int num=4454_4_5; 
	       float num1=4645.5_4f;
	       System.out.println("Intger value :"+num);
	       System.out.println("Float value "+num1);
	    System.out.println("instance1.hashCode():- "
	                                      + instance1.hashCode());
	    System.out.println("instance2.hashCode():- "
	                                      + instance2.hashCode());
	    } 

}
