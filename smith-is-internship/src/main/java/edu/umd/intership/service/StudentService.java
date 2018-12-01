package edu.umd.intership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.umd.intership.model.Student;
import edu.umd.intership.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

/*	private List<Student> studentList = Arrays.asList(new Student("S01", "merlyn", "mangalath", "IS",
			new java.util.Date(System.currentTimeMillis()), "C drive", "merlyn.mangalath@rhsmith.umd.edu", "merlynfr"));
*/
	public List<Student> getAllStudents() {
		List<Student> studentList =  new ArrayList<Student>();
		studentRepository.findAll().forEach(studentList::add);
		return studentList;
	}
	
	public Student getStudentByUsername(String id) {
		return studentRepository.getStudentByUserId(id);
	}
}
