package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.ContactEntity;
import com.contact.model.Contact;
import com.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactRepository contactRepository;
	

	@Override
	public boolean saveContact(Contact contact) {
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(contact, entity);
		ContactEntity isSaved = contactRepository.save(entity);
		return isSaved.getClass() != null;
	}

	@Override
	public boolean updateContact(Contact contact) {
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(contact, entity);
		//contactRepository.u
		return false;
	}

	@Override
	public Contact ContactFindById(int id) {
		Optional<ContactEntity> contactEntity = contactRepository.findById(id);
		if(contactEntity.isPresent()){
			ContactEntity entity = contactEntity.get();
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			return contact;
		}
		
		return null;
	}

	@Override
	public List<Contact> getAllContact() {
		List<ContactEntity> contactEntities = contactRepository.findAll();
		List<Contact> contacts=new ArrayList<Contact>();
		contactEntities.forEach(entity->{
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			contacts.add(contact);
		});
		return contacts;
	}

	@Override
	public boolean deleteContact(int id) {
		contactRepository.deleteById(id);
		return true;
	}

}
