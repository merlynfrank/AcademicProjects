package edu.umd.intership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.umd.intership.model.User;
import edu.umd.intership.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository userRepository;
	//private List<User> userList = new ArrayList<>(Arrays.asList(new User("merlyn","merlyn","student")));
	
	public List<User> getAllUsers(){
		List<User> userList = new ArrayList<User>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}
	
	public void addUser(User user) {
		//userList.add(user);
	}
	
	public User getUserById(String id) {
		return userRepository.findByUserName(id);
	}
}
