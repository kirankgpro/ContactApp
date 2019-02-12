package com.kiran.contactapp.dao;

import java.util.List;

import com.kiran.contactapp.domain.Contact;

public interface ContactDao {

	public void save(Contact contact) ;
	
	public Contact findContactById(int id);
	
	public List<Contact> getContactList();

	public Boolean deletetById(int id);
	
	
}
