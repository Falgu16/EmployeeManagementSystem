package com.trainingbasket.ems.beans;

public class Receptionist extends Employee implements Role {

	String telephoneExt;

	public String getTelephoneExt() {
		return telephoneExt;
	}

	public void setTelephoneExt(String telephoneExt) {
		this.telephoneExt = telephoneExt;
	}

	public Receptionist() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nExtension : " + this.telephoneExt;
	}

	@Override
	public double findTaxCalculation() {
		return this.getSalary() * .7;
	}

	@Override
	public String getRoleName() {
				return "Management Of Reception";
	}

	@Override
	public String getResponsibility() {
		return "Attend all calls without a fail";
	}
}
