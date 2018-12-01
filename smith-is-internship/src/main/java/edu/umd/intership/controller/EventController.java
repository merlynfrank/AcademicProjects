package edu.umd.intership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.umd.intership.model.Event;
import edu.umd.intership.service.EventService;

@RestController
public class EventController {

	@Autowired
	private EventService eventService;

	@RequestMapping("/createEvent")
	public String createEvent() {
		return "Success";
	}

	@RequestMapping("/updateEvent")
	public String updateEvent() {
		return "Success";
	}

	@RequestMapping("/deleteEvent")
	public String deleteEvent() {
		return "Success";
	}

	@RequestMapping("/fetchEvent")
	public String fetchEvent() {
		return "Success";
	}

	@RequestMapping("/events")
	public List<Event> getAllEvents() {
		return eventService.getAllEvents();
	}
}
