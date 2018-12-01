package edu.umd.intership.model;

public class CareerService {
	private String ocsID;
	private String ocsName;
	private String ocsPhoneNo;
	private String ocsEmail;
	private String userID;

	public CareerService() {
	}

	public CareerService(String ocsID, String ocsName, String ocsPhoneNo, String ocsEmail, String userID) {
		super();
		this.ocsID = ocsID;
		this.ocsName = ocsName;
		this.ocsPhoneNo = ocsPhoneNo;
		this.ocsEmail = ocsEmail;
		this.userID = userID;
	}

	public String getOcsID() {
		return ocsID;
	}

	public void setOcsID(String ocsID) {
		this.ocsID = ocsID;
	}

	public String getOcsName() {
		return ocsName;
	}

	public void setOcsName(String ocsName) {
		this.ocsName = ocsName;
	}

	public String getOcsPhoneNo() {
		return ocsPhoneNo;
	}

	public void setOcsPhoneNo(String ocsPhoneNo) {
		this.ocsPhoneNo = ocsPhoneNo;
	}

	public String getOcsEmail() {
		return ocsEmail;
	}

	public void setOcsEmail(String ocsEmail) {
		this.ocsEmail = ocsEmail;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

}
