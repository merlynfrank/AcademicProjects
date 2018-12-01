package edu.umd.intership.model;

public class EventRegistration {
	private String registrationId;
	private String studentId;
	private String eventId;

	public EventRegistration() {
	}

	public EventRegistration(String registrationId, String studentId, String eventId) {
		super();
		this.registrationId = registrationId;
		this.studentId = studentId;
		this.eventId = eventId;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

}
