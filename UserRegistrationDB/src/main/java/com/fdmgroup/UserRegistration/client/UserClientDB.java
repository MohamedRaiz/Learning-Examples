package com.fdmgroup.UserRegistration.client;

import java.util.Scanner;

import com.fdmgroup.UserRegistration.Controller.RegistrationController;
import com.fdmgroup.UserRegistration.model.Dao;
import com.fdmgroup.UserRegistration.model.DaoUser;
import com.fdmgroup.UserRegistration.model.DbSingleton;
import com.fdmgroup.UserRegistration.model.FileReadCommand;
import com.fdmgroup.UserRegistration.model.FileWriteCommand;
import com.fdmgroup.UserRegistration.model.User;

public class UserClientDB {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		FileReadCommand reader = new FileReadCommand();
		FileWriteCommand writer = new FileWriteCommand();
		RegistrationController registrationController = new RegistrationController(reader, writer);
		DaoUser dao = new DaoUser(DbSingleton.getInstance());
		System.out.println("--------------------------------------------------");
		System.out.println("\t\tRegistration");
		System.out.println("--------------------------------------------------");
		System.out.println("Please enter a Username: ");
		String user = scanner.next();
		System.out.println("Please enter a Password: ");
		String passwd = scanner.next();
		System.out.println("Please enter a Role: ");
		String role = scanner.next();
		System.out.println();
		System.out.println("Choose an Operation:");
		System.out.println("1. Add a User");
		System.out.println("2. Remove a User");
		System.out.println("3. Get a User");
		System.out.println("4. Update Password");
		System.out.println("5. Update Role");
		System.out.println("6. Get All Users");
		int choice = scanner.nextInt();
		System.out.println("\nYou have chosen option : " + choice);
		switch (choice) {
		case 1:
			dao.addUser(user, passwd, role);
			break;
		case 2:
			dao.removeUser(user);
			break;
		case 3:
			dao.getUser(user);
			break;
		case 4:
			dao.updatePassword(user, passwd);
			break;
		case 5:
			dao.updateRole(user, role);
			break;
		case 6:
			dao.getAllUsers();
			break;
		default:
			break;

		}

		// registrationController.registerNewUser("Hendayr", "Qwerty", "Pilot");

		// dao.addUser("Jeffrey'Or", "Dsadg123zd", "Pilot");
		// dao.removeUser("Jeffrey'Or");
		// dao.getUser("Jeffrey'Or");
		// dao.updatePassword("Jeffrey'Or", "New1233432");
		// dao.updateRole("Jeffrey'Or", "Traveller");
		// dao.getAllUsers();

	}

}
