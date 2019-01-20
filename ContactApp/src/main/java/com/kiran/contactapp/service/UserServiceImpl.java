package com.kiran.contactapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiran.contactapp.dao.UserDao;
import com.kiran.contactapp.domain.User;

import exception.UserBlockedException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void register(User user) {
		userDao.saveUser(user);
	}

	public User login(String loginName, String password) throws UserBlockedException {
		return null;
	}
}
