package edu.umd.intership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.umd.intership.model.Company;
import edu.umd.intership.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@RequestMapping("/createCompanyProfile")
	public String createCompanyProfile() {
		return "Success";
	}

	@RequestMapping("/updateCompanyProfile")
	public String updateCompanyProfile() {
		return "Success";
	}

	@RequestMapping("/deleteCompanyProfile")
	public String deleteCompanyProfile() {
		return "Success";
	}

	@RequestMapping("/fetchCompanyProfile")
	public String fetchCompanyProfile() {
		return "Success";
	}

	@RequestMapping("/companies")
	public List<Company> getAllCompanies() {
		return companyService.getAllCompanies();
	}
}
