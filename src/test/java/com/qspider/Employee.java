package com.qspider;

public class Employee {
	String eName;
	int empID;
	String dept;
	
	public Employee(String eName,int eID,String dept) {
		this.eName = eName;
		this.empID = eID;
		this.dept = dept;
	}

public void empDetails(){
	System.out.println(eName);
	System.out.println(empID);
	System.out.println(dept);
	
	
	
}
}