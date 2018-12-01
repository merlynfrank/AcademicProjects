package edu.umd.intership.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.umd.intership.model.JobPosting;
import edu.umd.intership.service.JobPostingService;

@RestController
public class JobPostingController {

	@Autowired
	private JobPostingService jobPostingService;

	@RequestMapping("/createJobPosting")
	public String createJobPosting() {
		return "Success";
	}

	@RequestMapping("/updateJobPosting")
	public String updateJobPosting() {
		return "Success";
	}

	@RequestMapping("/deleteJobPosting")
	public String deleteJobPosting() {
		return "Success";
	}

	@RequestMapping("/fetchJobPosting")
	public String fetchJobPosting() {
		return "Success";
	}

	@RequestMapping("/jobPostings")
	public List<JobPosting> getAlljobPostings() {
		return jobPostingService.getAllJobPostings();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/jobsearch/{jobType}/{jobTitle}/{jobLocation}")
	public List<JobPosting> getByJobTitleAndJobTypeAndJobLocation(@PathVariable String jobType,
			@PathVariable String jobTitle, @PathVariable String jobLocation, Model model) {
		List<JobPosting> jobs = jobPostingService.getAllJobPostings();
		List<JobPosting> filteredjobs = new ArrayList<JobPosting>();

		if (!jobType.equalsIgnoreCase("Select")) {
			for (JobPosting job : jobs) {
				if (job.getJobType().equalsIgnoreCase(jobType))
					filteredjobs.add(job);
			}
		}

		if (!jobTitle.equalsIgnoreCase("Select")) {

			for (JobPosting job : jobs) {
				if (job.getJobTitle().equalsIgnoreCase(jobTitle))
					filteredjobs.add(job);
			}
		}

		if (!jobType.equalsIgnoreCase("Select")) {

			for (JobPosting job : jobs) {
				if (job.getJobType().equalsIgnoreCase(jobType))
					filteredjobs.add(job);
			}
		}
		if (!jobLocation.equalsIgnoreCase("Select")) {

			for (JobPosting job : jobs) {
				if (job.getJobLocation().equalsIgnoreCase(jobLocation))
					filteredjobs.add(job);
			}
		}

		if (!jobLocation.equalsIgnoreCase("Select") && !jobType.equalsIgnoreCase("Select")) {

			for (JobPosting job : jobs) {
				if (job.getJobLocation().equalsIgnoreCase(jobLocation) && job.getJobType().equalsIgnoreCase(jobType))
					filteredjobs.add(job);
			}
		}

		if (!jobTitle.equalsIgnoreCase("Select") && !jobType.equalsIgnoreCase("Select")) {

			for (JobPosting job : jobs) {
				if (job.getJobTitle().equalsIgnoreCase(jobTitle) && job.getJobType().equalsIgnoreCase(jobType))
					filteredjobs.add(job);
			}
		}

		if (!jobLocation.equalsIgnoreCase("Select") && !jobTitle.equalsIgnoreCase("Select")
				&& !jobType.equalsIgnoreCase("Select")) {

			for (JobPosting job : jobs) {
				if (job.getJobTitle().equalsIgnoreCase(jobTitle) && job.getJobType().equalsIgnoreCase(jobType)
						&& job.getJobLocation().equalsIgnoreCase(jobLocation))
					filteredjobs.add(job);
			}
		}
		return filteredjobs;
	}
}
