package com.bridgelabz.MappingDeno;


public class Student {

	private int studid;
	private String studname;
	private Address address;
	
	  public Student() 
	  {
	    super();
	  }

	public Student(int studid, String studname) {
		super();
		this.studid = studid;
		this.studname = studname;
	}

	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}
	
}
