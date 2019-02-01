package com.kiran.contactapp.service;

import javax.transaction.Transactional;

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

	@Override
	@Transactional
	public Integer saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	@Transactional
	public User loginAuthenticate(String name, String password) {
		User user = userDao.findUserByName(name);
		if(user!=null) {
			if(user.getLoginName().equals(name) && user.getPassword().equals(password)) {
				return user;
			}else {
				return null;
			}
		}else {
			return null;
		}
	
	}
	
	
}
