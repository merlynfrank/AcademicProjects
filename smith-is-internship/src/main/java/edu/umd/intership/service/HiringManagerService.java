package edu.umd.intership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.umd.intership.model.HiringManager;
import edu.umd.intership.repository.HiringManagerRepository;

@Service
public class HiringManagerService {
	
	@Autowired
	HiringManagerRepository hiringManagerRepository;

	/*private List<HiringManager> managerList = Arrays.asList(new HiringManager("HM01", "Merlyn", "Mangalath", "HR",
			"HR", "abc", "62537", "CA", "C01",
			"JPMC", "merlynfr"));*/
	
	/*public List<HiringManager> getAllhiringManagers(){
		List<HiringManager> managerList = new ArrayList<HiringManager>();
		hiringManagerRepository.findAll().forEach(managerList::add);
		return managerList;
	}*/
}
