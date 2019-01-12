package com.fdmgroup.UserRegistration.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileReadCommand implements ReadCommand {

	private final static Logger managerLogs = LogManager.getLogger("managerLogs");

	public User readUser(String username) {

		User user = new User();
		String filename = "UserDetails.txt";
		try {
			Reader reader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			while (line != null) {
				if (line.indexOf(username) == 0) { // Checking for username in the line. As username is the first few
													// characters. if it can identify, it will return the first
													// character, which is 0.
					String parts[] = line.split(",");
					user.setUsername(parts[0]);
					user.setPassword(parts[1]);
					user.setRole(parts[2]);
					return user;
				} else {

					line = bufferedReader.readLine();
				}

			}
			// Using logger method
			managerLogs.trace("\nUser not found. Creating an account below: ");
			// System.out.println("\nUser not found. Creating an account below: ");
			bufferedReader.close();
			return null;

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return user;
	}
}
