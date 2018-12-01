package edu.umd.intership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.umd.intership.model.JobPosting;
import edu.umd.intership.repository.JobPostingRepository;

@Service
public class JobPostingService {

	@Autowired
	JobPostingRepository jobPostingRepository;
	
	/*private List<JobPosting> jobPostingList = Arrays.asList(new JobPosting("JP01", "C01", "JPMC", "BA", "CA", "Analyst",
			"2-3y", "All", "Bachelors", "NA", 100000, new java.util.Date(System.currentTimeMillis()),
			new java.util.Date(System.currentTimeMillis()), "HM01"));
*/
	public List<JobPosting> getAllJobPostings() {
		List<JobPosting> jobPostingList = new ArrayList<JobPosting>();
		jobPostingRepository.findAll().forEach(jobPostingList::add);
		return jobPostingList;
	}
	
/*	public List<JobPosting> getByJobTitle(){
		List<JobPosting> jobPostingList = new ArrayList<JobPosting>();
		return jobPostingList;
	}
	public List<JobPosting> getByJobType(){
		List<JobPosting> jobPostingList = new ArrayList<JobPosting>();
		return jobPostingList;
	}
	public List<JobPosting> getByJobLocation(){
		List<JobPosting> jobPostingList = new ArrayList<JobPosting>();
		return jobPostingList;
	}
	
	public List<JobPosting> getByJobTitleAndJobType(){
		List<JobPosting> jobPostingList = new ArrayList<JobPosting>();
		return jobPostingList;
	}
	
	public List<JobPosting> getByJobTitleAndJobLocation(){
		List<JobPosting> jobPostingList = new ArrayList<JobPosting>();
		return jobPostingList;
	}
	public List<JobPosting> getByJobTypeAndJobLocation(){
		List<JobPosting> jobPostingList = new ArrayList<JobPosting>();
		return jobPostingList;
	}*/
	public List<JobPosting> getByJobTitleAndJobTypeAndJobLocation(String jobTitle, String jobType, String jobLocation){
		List<JobPosting> jobPostingList = new ArrayList<JobPosting>();
		//jobPostingRepository.findByJobTitleAndJobTypeAndJobLocationAllIgnoreCase(jobTitle, jobType, jobLocation);
		jobPostingRepository.findByJobTitle(jobTitle);
		return jobPostingList;
	}
}
