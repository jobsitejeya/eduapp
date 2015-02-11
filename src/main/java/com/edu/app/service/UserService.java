package com.edu.app.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.edu.app.domain.User;


@Service("userService")
@Repository
@Transactional
public class UserService implements IUserService {

	
	private EntityManager em; 
	
	public User save(User userToBeSaved){
		
		em.persist(userToBeSaved);
		
		System.out.println(userToBeSaved.getPkId());
		em.flush();
		
		return userToBeSaved;
	}

	
	public EntityManager getEm() {
		return em;
	}
	@PersistenceContext 
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
}
