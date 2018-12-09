package com.fdmgroup.UserRegistration.client;

import com.fdmgroup.UserRegistration.Controller.RegistrationController;
import com.fdmgroup.UserRegistration.model.FileReadCommand;
import com.fdmgroup.UserRegistration.model.FileWriteCommand;

public class UserRegistrationClient {

	public static void main(String[] args) {

		FileReadCommand reader = new FileReadCommand();
		FileWriteCommand writer = new FileWriteCommand();
		RegistrationController registrationController = new RegistrationController(reader, writer);
		registrationController.registerNewUser("Hendayr", "Qwerty", "Pilot");
		// registrationController.registerNewUser("Jayewq", "Qwerty", "Pilot");

		// User x = registrationController.verifyUser("Raiz");
		// System.out.println("\nVerify in Progress: " + x);
	}
}
