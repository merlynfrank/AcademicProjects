package edu.umd.intership.model;

public class Company {
	private String companyId;
	private String companyName;
	private String CompanyRegion;

	public Company() {
	}

	public Company(String companyId, String companyName, String companyRegion) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		CompanyRegion = companyRegion;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyRegion() {
		return CompanyRegion;
	}

	public void setCompanyRegion(String companyRegion) {
		CompanyRegion = companyRegion;
	}

}
