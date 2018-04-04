package com.bridgeit.model;

import java.util.Set;

public class Department {	

	private int deptId;
	private String departName;
	private Set emplyoees;
	
	public Department(int deptId, String departName) {
	
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public Set getEmplyoees() {
		return emplyoees;
	}
	public void setEmplyoees(Set emplyoees) {
		this.emplyoees = emplyoees;
	}

	



}
