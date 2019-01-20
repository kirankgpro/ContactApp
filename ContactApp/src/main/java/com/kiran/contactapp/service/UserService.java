package com.kiran.contactapp.service;

import com.kiran.contactapp.domain.User;

import exception.UserBlockedException;

/*
 * @author Kiran
 */
public interface UserService {

	int LOGIN_STATUS_ACTIVE=1;
	int LOGIN_STATUS_BLOCKED=2;
	int ROLE_ADMIN=1;
	int ROLE_USER=2;
	
	public void register(User user);

	/*
	 * @param loginName user login name
	 * @param password user password
	 * @return User 
	 * @throws UserBlockedException when user account is blocked
	 */
	public User login(String loginName, String password) throws UserBlockedException;

}
