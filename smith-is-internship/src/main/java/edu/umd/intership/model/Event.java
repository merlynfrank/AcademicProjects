package edu.umd.intership.model;

import java.util.Date;

public class Event {
	private String eventId;
	private String eventName;
	private String eventDesc;
	private Date eventDate;
	private String eventLocation;
	private String targetAudience;
	private String ocsID;

	public Event() {
	}

	public Event(String eventId, String eventName, String eventDesc, Date eventDate, String eventLocation,
			String targetAudience, String ocsID) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDesc = eventDesc;
		this.eventDate = eventDate;
		this.eventLocation = eventLocation;
		this.targetAudience = targetAudience;
		this.ocsID = ocsID;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public String getOcsID() {
		return ocsID;
	}

	public void setOcsID(String ocsID) {
		this.ocsID = ocsID;
	}
}
