package edu.umd.intership.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobposting")
public class JobPosting {

	@Id
	@Column(name="jobid")
	private String jobID;
	@Column(name="companyid")
	private String companyID;
	@Column(name="companyname")
	private String companyName;
	@Column(name="jobtitle")
	private String jobTitle;
	@Column(name="joblocation")
	private String jobLocation;
	@Column(name="jobtype")
	private String jobType;
	@Column(name="experience")
	private String experience;
	@Column(name="workauthorization")
	private String workAuthorization;
	@Column(name="qualification")
	private String qualification;
	@Column(name="description")
	private String description;
	@Column(name="salary")
	private double salary;
	@Column(name="postdate")
	private Date postDate;
	@Column(name="expirationdate")
	private Date expirationDate;
	@Column(name="empid")
	private String empID;

	public JobPosting() {
	}

	public JobPosting(String jobID, String companyID, String companyName, String jobTitle, String jobLocation,
			String jobType, String experience, String workAuthorization, String qualification, String description,
			double salary, Date postDate, Date expirationDate, String empID) {
		super();
		this.jobID = jobID;
		this.companyID = companyID;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.jobLocation = jobLocation;
		this.jobType = jobType;
		this.experience = experience;
		this.workAuthorization = workAuthorization;
		this.qualification = qualification;
		this.description = description;
		this.salary = salary;
		this.postDate = postDate;
		this.expirationDate = expirationDate;
		this.empID = empID;
	}

	public String getJobID() {
		return jobID;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getWorkAuthorization() {
		return workAuthorization;
	}

	public void setWorkAuthorization(String workAuthorization) {
		this.workAuthorization = workAuthorization;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

}
