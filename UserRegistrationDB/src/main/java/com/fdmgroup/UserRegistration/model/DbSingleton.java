package com.fdmgroup.UserRegistration.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DbSingleton {
	private static String db_url;
	private static String db_user;
	private static String db_password;
	private static Connection conn;
	private final static Logger log = LogManager.getLogger();

	private DbSingleton() {
		/*
		 * Default database parameters
		 */

		db_url = "jdbc:oracle:thin:@localhost:1521:XE";
		db_user = "Trainee1";
		db_password = "!QAZSE4";
		/* Creation of an instance of the connection statement */
		setConnection();
	}

	/* Private method charge to set the connection statement */
	private static void setConnection() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "" + db_url;
			conn = DriverManager.getConnection(url, db_user, db_password);
		} catch (SQLException ex) {
			log.error("Unable to set connection", ex);
		}
	}

	/*
	 * Private inner class responsible for instantiating the single instance of the
	 * singleton
	 */
	private static class DbSingeltonManagerHolder {
		private final static DbSingleton instance = new DbSingleton();
	}

	/**
	 * @return Public method, which is the only method allowed to return an instance
	 *         of the singleton (the instance here is the database connection
	 *         statement)
	 */
	public static DbSingleton getInstance() {
		try {
			return DbSingeltonManagerHolder.instance;
		} catch (ExceptionInInitializerError ex) {
			log.error("Unable to get Instance", ex);
			return null;
		}

	}

	public Statement getStatement() {
		try {
			return conn.createStatement();
		} catch (SQLException ex) {
			log.error("Unable to create statement", ex);
			return null;
		}

	}

	public Connection getConnection() {
		return conn;

	}
}
