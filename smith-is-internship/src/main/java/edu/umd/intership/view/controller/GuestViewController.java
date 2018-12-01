package edu.umd.intership.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.umd.intership.service.UserService;

@Controller
public class GuestViewController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/guests/{surname}", method = RequestMethod.GET)
	public String showGuestList(Model model, @PathVariable("surname") String id) {
	    model.addAttribute("guests", userService.getUserById(id));
	    
	    return "results :: resultsList";
	}

	@RequestMapping(value = "/guests", method = RequestMethod.GET)
	public String showGuestList(Model model) {
	    model.addAttribute("guests", userService.getAllUsers());
	    
	    return "results :: resultsList";
	}
}
