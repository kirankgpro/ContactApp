package com.kiran.contactapp.dao;

import java.util.List;

import com.kiran.contactapp.domain.User;

public interface UserDao {

	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void removeUser(User user);
	
	public User findUserById(int id);
	
	public List<User> listUsers();
	
	
}
