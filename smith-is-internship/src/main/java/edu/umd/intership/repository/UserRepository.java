package edu.umd.intership.repository;

import org.springframework.data.repository.CrudRepository;

import edu.umd.intership.model.User;

public interface UserRepository extends CrudRepository<User, String>{

	public User findByUserName(String userName);
}
