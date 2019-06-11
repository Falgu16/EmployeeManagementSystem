package com.trainingbasket.ems.beans;

public abstract class Employee {

	static int tempid=0;
	private int Id;
	private String name;
	private String contactNumber;
	private String Address;
	private double salary;

	
	public abstract double findTaxCalculation() ;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Id  : "+this.Id				+ 
				"\nName : "+this.name+
				"\nContact : "+this.contactNumber+
				"\nAddress : "+this.Address+
				"\nSalary : "+this.salary;
	}
	
	public Employee() {
		this.Id=++tempid;
	}

	
	public int getId() {
		return Id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


}
