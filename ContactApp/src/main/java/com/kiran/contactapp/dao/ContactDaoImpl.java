package com.kiran.contactapp.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiran.contactapp.domain.Contact;

@Repository
public class ContactDaoImpl implements ContactDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Contact contact) {
		sessionFactory.getCurrentSession().saveOrUpdate(contact);

	}

	@Override
	public Contact findContactById(int id) {
		return sessionFactory.getCurrentSession().get(Contact.class, id);
	}

	@Override
	public List<Contact> getContactList() {
		return sessionFactory.getCurrentSession().createCriteria(Contact.class).list();

	}

	@Override
	public Boolean deletetById(int id) {
	
		try {
			sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Contact.class,id));
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
