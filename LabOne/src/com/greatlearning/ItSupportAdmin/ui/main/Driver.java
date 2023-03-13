package com.greatlearning.ItSupportAdmin.ui.main;

import java.util.Scanner;

import com.greatlearning.ItSupportAdmin.data.Employee;
import com.greatlearning.ItSupportAdmin.service.EmployeeCredentialService;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the department");
		System.out.println("1) Technical");
		System.out.println("2) Admin");
		System.out.println("3) Human Resource");
		System.out.println("4) Legal");
		System.out.print("Enter your choice : ");
		
		int choice = in.nextInt();		
		String departmentName = "";
		
		switch(choice) {
			case 1:
				departmentName = "tech";
				break;
			case 2:
				departmentName = "admin";
				break;
			case 3:
				departmentName = "hr";
				break;
			case 4:
				departmentName = "legal";
				break;
			default:
				System.out.println("\nInvalid Input given");
				choice = -1;
				break;
		}
		
		if(choice != -1) {
			Employee employee = new Employee("Shankar", "Gijinepalle");
			EmployeeCredentialService service = new EmployeeCredentialService();

			employee.setDepartmentName(departmentName);
			employee.setEmail(service.generateEmail(employee));
			employee.setPassword(service.generatePassword());
			
			service.showCredentials(employee);			
		}
		
		in.close();
	}

}
