package com.contact.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.contact.model.Contact;
import com.contact.service.ContactService;

@Controller
public class ViewContact {

	@Autowired
	ContactService contactService;
	
	@GetMapping(value="editContact")
	public String editContact(@RequestParam("cid") Integer cid,Model model) {
		Contact contact = contactService.ContactFindById(cid);
		model.addAttribute("contact",contact);
		return "index";
	}
		
	@GetMapping(value="deleteContact")
	public String deleteContact(@RequestParam("cid") Integer cid,RedirectAttributes model) {
		contactService.deleteContact(cid);
		model.addFlashAttribute("deleteMsg","Contact Deleted Successfully");
		return "redirect:dispalyContacts";
	}
}
