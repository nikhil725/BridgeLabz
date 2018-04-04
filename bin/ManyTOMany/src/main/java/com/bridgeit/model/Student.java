package com.bridgeit.model;

import java.util.Set;

public class Student {


	private short studentId;
	private String studentName;
	private short marks;
	private Set courses;

	
	public short getStudentId() 
	{
		return studentId;
	}
	public void setStudentId(short studentId) 
	{
		this.studentId = studentId;
	}
	public String getStudentName() 
	{
		return studentName;
	}
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	public short getMarks() 
	{
		return marks;
	}
	public void setMarks(short marks) 
	{
		this.marks = marks;
	}
	public Set getCourses() 
	{
		return courses;
	}
	public void setCourses(Set courses) 
	{
		this.courses = courses;
	}
}
