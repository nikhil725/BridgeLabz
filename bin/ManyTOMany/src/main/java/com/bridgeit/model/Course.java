package com.bridgeit.model;

import java.util.Set;

public class Course {

	private short courseId;
	private String courseName;
	private String duration;
	private Set students; 
	
	
	public short getCourseId() 
	{
		return courseId;
	}
	public void setCourseId(short courseId) 
	{
		this.courseId = courseId;
	}
	public String getCourseName() 
	{
		return courseName;
	}
	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}
	public String getDuration() 
	{
		return duration;
	}
	public void setDuration(String duration) 
	{
		this.duration = duration;
	}
	public Set getStudents() 
	{
		return students;
	}
	public void setStudents(Set students) 
	{
		this.students = students;
	}
}
