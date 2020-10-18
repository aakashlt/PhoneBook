package com.contact.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.contact.model.Contact;
import com.contact.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value={"/","/loadIndex"})
	public String dispalyContactsForm(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact",contact);
		return "index";
	}
	
	@PostMapping("/saveContact")
	public String saveContact(@ModelAttribute("contact") Contact contact,RedirectAttributes model) {
	System.out.println("contact"+contact);
		boolean isSaved = contactService.saveContact(contact);
		if(isSaved) {
			if(contact.getCid()!=null) {
				model.addFlashAttribute("succMsg","Contact Updated");
			}
			else {
				model.addFlashAttribute("succMsg","Contact Saved");
			}
		}
		else {
			model.addFlashAttribute("errorMsg","Faild to save contact");
		}
		return "redirect:loadIndex";
	}
	
	@GetMapping("/dispalyContacts")
	public String dispalyContacts(Model model) {
		List<Contact> contacts = contactService.getAllContact();
		System.out.println(contacts);
		model.addAttribute("contacts",contacts);
		return "dispalyContacts";
	}

}
