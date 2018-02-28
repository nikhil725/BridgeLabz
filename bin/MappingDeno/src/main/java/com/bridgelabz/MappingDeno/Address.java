package com.bridgelabz.MappingDeno;

public class Address {

	private int studid;
	private String flatNo, Street, City;
	private Student student;

	public Address() 
	{
		super();
	}

	public Address(String flatNo, String Street, String City, Student student) {

		super();
		this.flatNo = flatNo;
		this.Street = Street;
		this.City = City;
		this.student = student;

	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


}
