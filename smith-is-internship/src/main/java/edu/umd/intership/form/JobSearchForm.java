package edu.umd.intership.form;

public class JobSearchForm {

	private String jobType;
	private String jobTitle;
	private String joblocation;

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJoblocation() {
		return joblocation;
	}

	public void setJoblocation(String joblocation) {
		this.joblocation =joblocation;
	}

	public JobSearchForm(String jobType, String jobTitle, String joblocation) {
		super();
		this.jobType = jobType;
		this.jobTitle = jobTitle;
		this.joblocation = joblocation;
	}

	public JobSearchForm() {

	}
}
