package com.kiran.contactapp.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import com.kiran.contactapp.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Integer saveUser(User user) {
		Integer userId = (Integer) sessionFactory.getCurrentSession().save(user);
		return userId;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findUserById(int id) {
		return sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByName(String name) {
		String sql = "select * from User where loginName = :name";
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql);
		query.addEntity(User.class);
		query.setParameter("name", name);
		List<User> rows = query.list();
		for(User row : rows){
			return row;
		}
		return null;
	}



}
