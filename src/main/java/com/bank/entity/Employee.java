package com.bank.entity;

public class Employee {
	
	public int getWeekdayOffs() {
		return weekdayOffs;
	}
	public void setWeekdayOffs(int weekdayOffs) {
		this.weekdayOffs = weekdayOffs;
	}
	public String name; 
	public String	empId; 
	public String ssn; 
	public String	designation;
	
	public int weekdayOffs;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	} 
	
	
	

}
