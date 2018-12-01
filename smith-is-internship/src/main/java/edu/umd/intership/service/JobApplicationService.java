package edu.umd.intership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.umd.intership.model.JobApplication;
import edu.umd.intership.repository.JobApplicationRepository;

@Service
public class JobApplicationService {

	@Autowired
	JobApplicationRepository jobApplicationRepository;
	/*private List<JobApplication> appList = Arrays
			.asList(new JobApplication("AP01", "S01", "JP01", new java.util.Date(System.currentTimeMillis())));
	*/
	public List<JobApplication> getAlljobApplications(){
		List<JobApplication> appList = new ArrayList<JobApplication>();
		jobApplicationRepository.findAll().forEach(appList::add);
		return appList;
	}
}
