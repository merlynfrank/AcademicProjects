package edu.umd.intership.repository;

import org.springframework.data.repository.CrudRepository;

import edu.umd.intership.model.JobApplication;

public interface JobApplicationRepository extends CrudRepository<JobApplication, String>{

}
