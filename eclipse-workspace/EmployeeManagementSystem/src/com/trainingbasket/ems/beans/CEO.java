package com.trainingbasket.ems.beans;

public class CEO extends Employee implements Role {

	public CEO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	
	@Override
	public String getRoleName() {
		return "Owner OF Organisation";
	}

	@Override
	public String getResponsibility() {
		return "To Run Orgaisation";
	}

	@Override
	public double findTaxCalculation() {
		
		return getSalary()*.22;
	}

}
