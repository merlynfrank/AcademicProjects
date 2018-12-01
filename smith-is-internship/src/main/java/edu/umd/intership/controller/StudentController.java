package edu.umd.intership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.umd.intership.model.Student;
import edu.umd.intership.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/createStudentProfile")
	public String createStudentProfile() {
		return "Success";
	}

	@RequestMapping("/updateStudentProfile")
	public String updateStudentProfile() {
		return "Success";
	}

	@RequestMapping("/fetchStudentProfile")
	public String fetchStudentProfile() {
		return "Success";
	}

	@RequestMapping("/deleteStudentProfile")
	public String deleteStudentProfile() {
		return "Success";
	}

	@RequestMapping("/students")
	public List<Student> getAllstudents() {
		return studentService.getAllStudents();
	}
}
