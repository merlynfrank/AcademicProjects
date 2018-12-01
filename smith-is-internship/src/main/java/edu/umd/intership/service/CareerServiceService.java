package edu.umd.intership.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.umd.intership.model.CareerService;

@Service
public class CareerServiceService {

	
	private List<CareerService> ocs = Arrays.asList(new CareerService("OCS01", "John", "1273918","email", "JohnMalone"));
	
	public List<CareerService> getAllCareerServices(){
		return ocs;
	}
}
