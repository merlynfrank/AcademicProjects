package edu.umd.intership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.umd.intership.model.EventRegistration;
import edu.umd.intership.service.EventRegistrationService;

@RestController
public class EventRegistrationController {
	
	@Autowired
	private EventRegistrationService eventRegistrationService;
	
	@RequestMapping("/createEventRegistration")
	public String createEventRegistration() {
		return "Success";
	}
	
	@RequestMapping("/updateEventRegistration")
	public String updateEventRegistration() {
		return "Success";
	}
	
	@RequestMapping("/deleteEventRegistration")
	public String deleteEventRegistration() {
		return "Success";
	}
	
	@RequestMapping("/fetchEventRegistration")
	public String fetchEventRegistration() {
		return "Success";
	}
	
	@RequestMapping("/eventRegistrations")
	public List<EventRegistration> getAllEventRegistrations() {
		return eventRegistrationService.getAllEventRegistrations();
	}
}
