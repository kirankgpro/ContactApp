package com.kiran.contactapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kiran.contactapp.dao.ContactDao;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactDao contactDao;
	 
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void save() {
		
	}
	
}
