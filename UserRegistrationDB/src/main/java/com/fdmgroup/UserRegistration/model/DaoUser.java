package com.fdmgroup.UserRegistration.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaoUser implements Dao<User> {

	private static DbSingleton dbSingleton;
	private static Logger Logger = LogManager.getLogger("NewLogger");

	public DaoUser(DbSingleton dbSingleton) {
		DaoUser.dbSingleton = dbSingleton;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> allUsers = new ArrayList<User>();
		try {
			// set statements
			// sql query
			// String query = "SELECT USERNAME, PASSWORD, ROLE FROM USERREGISTER";
			// to execute query

			// ResultSet result = dbSingleton.getStatement().executeQuery(query);
			String query = "SELECT USERNAME,PASSWORD,ROLE FROM USERREGISTER";
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(query);
			ResultSet result = ps.executeQuery();

			// to go through the whole loop of data. result.next returns true if there is
			// data next line, else return false
			while (result.next()) {
				User user = new User();
				user.setUsername(result.getString(1));
				user.setPassword(result.getString(2));
				user.setRole(result.getString(3));
				Logger.info(user);
				allUsers.add(user);
			}

		} catch (SQLException sqle) {
			Logger.error(sqle.getMessage());
		} finally {
			// try {
			// dbSingleton.getConnection().close();
			// } catch (SQLException e) {
			// Logger.error(e.getMessage());
			// }
			// Comment out because once closed, cannot run another method call on main.
		}
		return allUsers;
	}

	@Override
	public void addUser(String username, String password, String Role) {

		try {
			// String query = "INSERT INTO USERREGISTER ( USERNAME, PASSWORD, ROLE) VALUES (
			// '" + username + "', '"
			// + password + "', '" + Role + "' )";

			// PreparedStatement method
			String query = "INSERT INTO USERREGISTER (USERNAME, PASSWORD,ROLE) VALUES (?,?,?)";
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(query);

			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, Role);
			int result = ps.executeUpdate();

			// int result = dbSingleton.getStatement().executeUpdate(query);
			Logger.info(result);

		} catch (SQLException sqle) {
			Logger.error(sqle.getMessage());
		} finally {
			// // Close the connection
			// try {
			// dbSingleton.getConnection().close();
			// } catch (SQLException e) {
			// Logger.error(e.getMessage());
			// }
		}
	}

	@Override
	public void removeUser(String username) {

		try {
			// get Statement Method
			// String query = "DELETE FROM USERREGISTER WHERE USERNAME = '" + username +
			// "'";

			// Prepared Statement method
			String query = "DELETE FROM USERREGISTER WHERE USERNAME = ?";

			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(query);

			ps.setString(1, username);
			int result = ps.executeUpdate();

			// get statement method
			// int result = dbSingleton.getStatement().executeUpdate(query);
			Logger.info(result);

		} catch (SQLException sqle) {
			Logger.error(sqle.getMessage());
		} finally {
			// Close the connection
			// try {
			// dbSingleton.getConnection().close();
			// } catch (SQLException e) {
			// Logger.error(e.getMessage());
			// }
		}

	}

	@Override
	public void updatePassword(String username, String password) {

		try {
			// get statement method
			// String query = "UPDATE USERREGISTER SET PASSWORD = '" + password + "' WHERE
			// USERNAME = '" + username + "'";

			// prepared statement method
			String query = "UPDATE USERREGISTER SET PASSWORD = ? WHERE USERNAME = ?";
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(query);
			ps.setString(1, password);
			ps.setString(2, username);
			int result = ps.executeUpdate();
			// int result = dbSingleton.getStatement().executeUpdate(query);
			Logger.info(result);

		} catch (SQLException sqle) {
			Logger.error(sqle.getMessage());
		} finally {
			// Close the connection
			// try {
			// dbSingleton.getConnection().close();
			// } catch (SQLException e) {
			// Logger.error(e.getMessage());
			// }
		}

	}

	@Override
	public void getUser(String username) {

		try {
			// get statement metod
			// String query = "SELECT USERNAME,PASSWORD,ROLE FROM USERREGISTER WHERE
			// USERNAME = '" + username + "'";

			// PREPARED STATEMENT METHOD
			String query = "SELECT USERNAME, PASSWORD,ROLE FROM USERREGISTER WHERE USERNAME = ?";
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(query);
			ps.setString(1, username);
			ResultSet result = ps.executeQuery();

			// ResultSet result = dbSingleton.getStatement().executeQuery(query);
			// must read through database although reading just 1. result.next brings you to
			// the next row. returns true when line exist, false when row is empty.
			while (result.next()) {
				Logger.info("This is the result of your search : [" + result.getString(1) + ", " + result.getString(2)
						+ ", " + result.getString(3) + "]");
			}

		} catch (SQLException sqle) {
			Logger.error(sqle.getMessage());
		} finally {
			// Close the connection
			// try {
			// dbSingleton.getConnection().close();
			// } catch (SQLException e) {
			// Logger.error(e.getMessage());
			// }
		}

	}

	@Override
	public void updateRole(String username, String Role) {
		try {
			// SQL Query here
			// UPDATE <TABLENAME> SET <COLUMN> = '" + new value + "' WHERE <COLUMN. = ...
			// String query = "UPDATE USERREGISTER SET ROLE = '" + Role + "' WHERE USERNAME
			// = '" + username + "'";
			// int result = dbSingleton.getStatement().executeUpdate(query);

			// PreparedStatement
			String query = "UPDATE USERREGISTER SET ROLE = ? WHERE USERNAME = ?";
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(query);
			ps.setString(1, Role);
			ps.setString(2, username);
			int result = ps.executeUpdate();

			Logger.info(result);

		} catch (SQLException sqle) {
			Logger.error(sqle.getMessage());
		} finally {
			// Close the connection
			// try {
			// dbSingleton.getConnection().close();
			// } catch (SQLException e) {
			// Logger.error(e.getMessage());
			// }
		}

	}

}
