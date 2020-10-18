package com.contact.service;

import java.util.List;

import com.contact.model.Contact;

public interface ContactService {

	public boolean saveContact(Contact contact);
	
	public boolean updateContact(Contact contact);
	
	public Contact ContactFindById(int id);
	
	public List<Contact> getAllContact();
	
	public boolean deleteContact(int id);
	
	
}
