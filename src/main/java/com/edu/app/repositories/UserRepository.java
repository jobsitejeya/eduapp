package com.edu.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.edu.app.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	List<User> findByLastname(String lastname);
	
}
