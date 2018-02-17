package com.bridgelabz.prototypedesignpattern;

import java.util.Scanner;

import com.bridgelabz.prototypedesignpattern.EmployeeRecord;


public class EmployeeDemo implements Cloneable {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee id");
		int empId = scanner.nextInt();
		
		System.out.println("Enter Employee Name");
		String empName = scanner.next();
		
		System.out.println("Enter Employee Departname");
		String empDept = scanner.next();
		
		System.out.println("Enter Employee Salary");
		Double salary = scanner.nextDouble();

		EmployeeRecord employeeRecord = new EmployeeRecord(empId, empName, empDept, salary);
		
		employeeRecord.showRecord();
		System.out.println();
		EmployeeRecord employeeRecord2 = (EmployeeRecord) employeeRecord.getClone();
		
		employeeRecord2.showRecord();
	}
}
