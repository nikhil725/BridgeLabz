package com.bridgelabz.singletonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		
	
	try
    {
        Singleton1 instance1 = Singleton1.instance;
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("/home/bridgeit/serilazation.txt"));
        out.writeObject(instance1);
        out.close();
 
        // deserailize from file to object
        ObjectInput in  = new ObjectInputStream(new FileInputStream("/home/bridgeit/serilazation.txt"));
         
        Singleton1 instance2 = (Singleton1) in.readObject();
        in.close();
 
        System.out.println("instance1 hashCode:- "+ instance1.hashCode());
        System.out.println("instance2 hashCode:- "+ instance2.hashCode());
    } 
     
    catch (Exception e) 
    {
        e.printStackTrace();
    }
}
}