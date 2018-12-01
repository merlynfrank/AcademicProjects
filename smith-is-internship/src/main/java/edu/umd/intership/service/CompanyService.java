package edu.umd.intership.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.umd.intership.model.Company;

@Service
public class CompanyService {

	private List<Company> companies = Arrays.asList(new Company("C01", "JPMC", "US"));

	public List<Company> getAllCompanies() {
		return companies;
	}
}
