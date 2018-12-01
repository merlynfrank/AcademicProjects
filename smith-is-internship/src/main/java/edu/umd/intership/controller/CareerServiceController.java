package edu.umd.intership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.umd.intership.model.CareerService;
import edu.umd.intership.service.CareerServiceService;

@RestController
public class CareerServiceController {

	@Autowired
	private CareerServiceService careerServiceService;
	
	@RequestMapping("/createCareerServiceProfile")
	public String createCareerServiceProfile() {
		return "Success";
	}

	@RequestMapping("/updateCareerServiceProfile")
	public String updateCareerServiceProfile() {
		return "Success";
	}

	@RequestMapping("/deleteCareerServiceProfile")
	public String deleteCareerServiceProfile() {
		return "Success";
	}

	@RequestMapping("/fetchCareerServiceProfile")
	public String fetchCareerServiceProfile() {
		return "Success";
	}

	@RequestMapping("/careerservices")
	public List<CareerService> getAllCareerServices() {
		return careerServiceService.getAllCareerServices();
	}
}
