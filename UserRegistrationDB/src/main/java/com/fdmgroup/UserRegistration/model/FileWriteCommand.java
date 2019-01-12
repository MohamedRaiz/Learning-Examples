package com.fdmgroup.UserRegistration.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteCommand implements WriteCommand {

	public void writeUser(User user) {
		String filename = "UserDetails.txt";// Here gives filename, text file
		try {
			Writer writer = new FileWriter(filename, true); // the writer object is useless on its own. Requires writer
															// object to perform write operation. As we writing to a
															// file, require a FileWriter.

			BufferedWriter bufferedWriter = new BufferedWriter(writer); // having a bufferedwriter and passing it
																		// filewriter will be use to perform actual
																		// write operations. Using bufferedwriter
																		// instead of simply fileWriter is so that we
																		// can write using Strings. Non-buffered writer
																		// cant do.

			bufferedWriter.write(user.getUsername() + ", " + user.getPassword() + ", " + user.getRole());
			bufferedWriter.newLine();
			bufferedWriter.close(); // we call close method for 2 reasons: the close method makes a call to the
									// flush method. the close method will free up resources being used by the
									// bufferedWriter Object. the writer object does not actually write directly to
									// the file we have specified. it instead writes to an output stream. similar to
									// concept of pushing data to the database.

		} catch (IOException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// Code here is guarenteed to run irregardless of exception or not.
		}

	}

}
