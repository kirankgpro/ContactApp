package com.kiran.contactapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiran.contactapp.domain.User;


@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
}