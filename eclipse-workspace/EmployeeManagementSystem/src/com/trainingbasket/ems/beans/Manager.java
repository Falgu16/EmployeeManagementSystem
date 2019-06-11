package com.trainingbasket.ems.beans;

public class Manager extends Employee implements Role {

	String Department;
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\nDepartment : "+this.Department;
	}
	@Override
	public double findTaxCalculation() {
		
		return getSalary()*.11;
	}
	@Override
	public String getRoleName() {
		// TODO Auto-generated method stub
		return "Management";
	}
	@Override
	public String getResponsibility() {
		// TODO Auto-generated method stub
		return "Managing Everything";
	}
	
}
