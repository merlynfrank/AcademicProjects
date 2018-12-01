package edu.umd.intership.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.umd.intership.model.EventRegistration;

@Service
public class EventRegistrationService {

	private List<EventRegistration> registrations = Arrays.asList(new EventRegistration("R01", "S01", "E01"));
	
	public List<EventRegistration> getAllEventRegistrations(){
		return registrations;
	}
}
