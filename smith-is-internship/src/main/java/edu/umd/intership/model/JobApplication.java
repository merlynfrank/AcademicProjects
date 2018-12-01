package edu.umd.intership.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application")
public class JobApplication {
	
	@Id
	@Column(name="applicationid")
	private String applicationID;
	@Column(name="sid")
	private String studentId;
	@Column(name="jobid")
	private String jobId;
	@Column(name="appdate")
	private Date appDate;

	public JobApplication() {

	}

	public JobApplication(String applicationID, String studentId, String jobId, Date appDate) {
		super();
		this.applicationID = applicationID;
		this.studentId = studentId;
		this.jobId = jobId;
		this.appDate = appDate;
	}

	public String getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

}
