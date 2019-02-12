package com.kiran.contactapp.service;

import java.util.List;

import com.kiran.contactapp.domain.Contact;

public interface ContactService {


	public void update();

	public void save(Contact contact);
	
	public Contact findContactById(int id);
	
	public List<Contact> getContactList();

	public Boolean deletetById(int id);
	
}
