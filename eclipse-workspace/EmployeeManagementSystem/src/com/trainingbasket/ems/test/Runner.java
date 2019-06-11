package com.trainingbasket.ems.test;

import java.util.ArrayList;

import com.trainingbasket.ems.beans.CEO;
import com.trainingbasket.ems.beans.Employee;
import com.trainingbasket.ems.beans.Manager;
import com.trainingbasket.ems.beans.Receptionist;

public class Runner {
	ArrayList<Employee> employees = new ArrayList<Employee>();
	ReadUtil readUtil = null;
	String employeeMenu = "======Employee Menu=====\n1. Add a CEO\n2. Add Manager\n3. Add Receptionist";

	public Runner() {
		readUtil = new ReadUtil();
		processUser();
	}

	private void processUser() {
		while (true) {
			printMenu();
			int opt = readUtil.readInt("Please make your choice from above menu",
					"Error Could not read : check the input");
			switch (opt) {
			case 1:
				readData();
				break;
			case 2:
				for (Employee employee : employees) {
					System.out.println(employee);
				}
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

	private void readData() {
		System.out.println(employeeMenu);
		int opt = readUtil.readInt("Please make your choice from above menu", "Error Could not read : check the input");
		switch (opt) {
		case 1:
			CEO ceo = new CEO();
			ceo.setName(readUtil.readString("Please Enter The Name of CEO", "Error"));
			ceo.setContactNumber(readUtil.readString("Please Enter The Contact Number of CEO", "Error"));
			ceo.setAddress(readUtil.readString("Please Enter The Address of CEO", "Error"));
			ceo.setSalary(readUtil.readDouble("Please Enter The Salary of CEO", "Error"));
			employees.add(ceo);
			break;
		case 2:
			Manager manager = new Manager();
			manager.setName(readUtil.readString("Please Enter The Name of Manager", "Error"));
			manager.setContactNumber(readUtil.readString("Please Enter The Contact Number of Manager", "Error"));
			manager.setAddress(readUtil.readString("Please Enter The Address of Manager", "Error"));
			manager.setSalary(readUtil.readDouble("Please Enter The Salary of Manager", "Error"));
			manager.setDepartment(readUtil.readString("Please Ente The Department", "Err"));
			employees.add(manager);
			break;
		case 3:
			Receptionist receptionist = new Receptionist();
			receptionist.setName(readUtil.readString("Please Enter The Name of Receptionist", "Error"));
			receptionist
					.setContactNumber(readUtil.readString("Please Enter The Contact Number of Receptionist", "Error"));
			receptionist.setAddress(readUtil.readString("Please Enter The Address of Receptionist", "Error"));
			receptionist.setSalary(readUtil.readDouble("Please Enter The Salary of Receptionist", "Error"));
			receptionist.setTelephoneExt(readUtil.readString("Please Enter The Address of Receptionist", "Error"));
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

	private void printMenu() {
		System.out.println("=============Main Menu================");
		System.out.println("1. Add New Employee");
		System.out.println("2. Show All  Employee");
		System.out.println("3. Save All Employees to Excel");
	}

	public static void main(String... args) {
		new Runner();
	}
}
