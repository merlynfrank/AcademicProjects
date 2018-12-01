package edu.umd.intership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.umd.intership.model.JobApplication;
import edu.umd.intership.service.JobApplicationService;

@RestController
public class JobApplicationController {

	@Autowired
	private JobApplicationService jobApplicationService;
	
	@RequestMapping("/createJobApplication")
	public String createJobApplication() {
		return "Success";
	}
	
	@RequestMapping("/updateJobApplication")
	public String updateJobApplication() {
		return "Success";
	}
	
	@RequestMapping("/deleteJobApplication")
	public String deleteJobApplication() {
		return "Success";
	}
	
	@RequestMapping("/fetchJobApplication")
	public String fetchJobApplication() {
		return "Success";
	}
	
	@RequestMapping("/jobApplications")
	public List<JobApplication> getAlljobApplications() {
		return jobApplicationService.getAlljobApplications();
	}
}
