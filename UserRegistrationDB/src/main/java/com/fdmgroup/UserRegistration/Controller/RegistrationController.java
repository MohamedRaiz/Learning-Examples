package com.fdmgroup.UserRegistration.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fdmgroup.UserRegistration.model.ReadCommand;
import com.fdmgroup.UserRegistration.model.User;
import com.fdmgroup.UserRegistration.model.UserFactory;
import com.fdmgroup.UserRegistration.model.WriteCommand;

public class RegistrationController {

	private final static Logger managerLogs = LogManager.getLogger("managerLogs");
	// Replacing Sysout with loggers. Need to create logger like above. then use
	// like below.

	private ReadCommand readCommand;
	private WriteCommand writeCommand;
	private UserFactory userFactory;

	// Constructor with 2 parameters
	public RegistrationController(ReadCommand readCommand, WriteCommand writeCommand) { // inheriting classes can
																						// implement the interface.
																						// therefore,in client, created
																						// fileWriteCommand and passed
																						// into controller, as
																						// WriteCommand Interface. Same
																						// for Read
		this.readCommand = readCommand;
		this.writeCommand = writeCommand;

	}

	public void registerNewUser(String username, String password, String role) {

		if (verifyUser(username) == null) {
			// using UserFactory to create new user
			userFactory = new UserFactory();
			User user = userFactory.createUser();
			// with the created user class, input username,password, and role.
			user.setUsername(username);
			user.setPassword(password);
			user.setRole(role);

			// printing out variables in user
			// System.out.println(user);
			managerLogs.trace(user);

			// Write Command
			writeCommand.writeUser(user);

		} else {
			managerLogs.trace("\nUser already Exist");
			managerLogs.trace(
					"\nUser username is: " + username + ", User password is: " + password + ", User role is: " + role);

			// System.out.println("User already Exist");
			// System.out.println(
			// "User username is: " + username + ", User password is: " + password + ", User
			// role is: " + role);
		}
		// This below is without if else statement
		// // using UserFactory to create new user
		// userFactory = new UserFactory();
		// User user = userFactory.createUser();
		// // with the created user class, input username,password, and role.
		// user.setUsername(username);
		// user.setPassword(password);
		// user.setRole(role);
		//
		// // printing out variables in user
		// System.out.println(user);
		//
		// // Write Command
		// writeCommand.writeUser(user);

	}

	public User verifyUser(String username) {
		// Verify User
		return readCommand.readUser(username);

	}
}
