package com.greatlearning.ItSupportAdmin.service;

import java.util.Random;

import com.greatlearning.ItSupportAdmin.data.Employee;

public class EmployeeCredentialService implements CredentialService {
	
	private static final String COMPANY_NAME = ".gl.in";
	
	
	public String generateEmail(Employee employee) {
		return employee.getFirstName() + employee.getLastName() + "@" + employee.getDepartmentName() + COMPANY_NAME;
	}

	public String generatePassword() {
		String digits = "0123456789";
		String specialCharacters = "!@#$%^&*()";
		// Convert char -> integer in ASCII form
		int baseValueCapitals = 'A';
		int baseValueSmall = 'a';
		Random rand = new Random();

		String newPassword = "";
		newPassword += digits.charAt(rand.nextInt(digits.length()));
		newPassword += specialCharacters.charAt(rand.nextInt(specialCharacters.length()));
		// This line will generate a character in A-Z range
		newPassword += (char) (baseValueCapitals + rand.nextInt(26));
		// This line will generate a character in a-z range
		newPassword += (char) (baseValueSmall + rand.nextInt(26));
		newPassword += digits.charAt(rand.nextInt(digits.length()));
		newPassword += specialCharacters.charAt(rand.nextInt(specialCharacters.length()));
		newPassword += (char) (baseValueCapitals + rand.nextInt(26));
		newPassword += (char) (baseValueSmall + rand.nextInt(26));
		
		return newPassword;
		
	}
	
	public void showCredentials(Employee employee) {
		System.out.println("\n\nDear " + employee.getFirstName() + " your generated credentials are as follows :\n");
		System.out.println("Email : " + employee.getEmail());
		System.out.println("Password : " + employee.getPassword());	
	}
	
}
