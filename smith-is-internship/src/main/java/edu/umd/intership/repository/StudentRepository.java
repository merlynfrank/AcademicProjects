package edu.umd.intership.repository;

import org.springframework.data.repository.CrudRepository;

import edu.umd.intership.model.Student;

public interface StudentRepository extends CrudRepository<Student, String>{

	public Student getStudentByUserId(String id);
}
