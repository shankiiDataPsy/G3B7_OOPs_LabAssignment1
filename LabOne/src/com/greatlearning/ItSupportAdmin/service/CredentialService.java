package com.greatlearning.ItSupportAdmin.service;

import com.greatlearning.ItSupportAdmin.data.Employee;

public interface CredentialService {
	
	public String generateEmail(Employee employee);

	public String generatePassword();
	
	public void showCredentials(Employee employee);

}
