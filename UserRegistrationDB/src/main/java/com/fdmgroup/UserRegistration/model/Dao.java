package com.fdmgroup.UserRegistration.model;

import java.util.List;

public interface Dao<T> {

	public List<User> getAllUsers();

	public void addUser(String username, String password, String Role);

	public void removeUser(String username);

	public void updatePassword(String username, String Password);

	public void updateRole(String username, String Role);

	public void getUser(String username);

}
