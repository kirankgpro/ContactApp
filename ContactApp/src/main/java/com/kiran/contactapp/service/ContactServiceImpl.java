package com.kiran.contactapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kiran.contactapp.dao.ContactDao;
import com.kiran.contactapp.domain.Contact;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactDao contactDao;
	 
	
	public void update(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void save(Contact contact) {
		contactDao.save(contact);
		
	}

	@Override
	@Transactional
	public Contact findContactById(int id) {
		return contactDao.findContactById(id);
	}

	@Override
	@Transactional
	public List<Contact> getContactList() {
		return contactDao.getContactList();
	}

	@Override
	@Transactional
	public Boolean deletetById(int id) {
		return contactDao.deletetById(id);
	}
	
}
