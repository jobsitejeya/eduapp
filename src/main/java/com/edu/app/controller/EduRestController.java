package com.edu.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.app.domain.User;
import com.edu.app.repositories.UserRepository;
import com.edu.app.service.IUserService;
import com.edu.app.service.UserService;

@Controller
@RequestMapping("/rest")
public class EduRestController {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private IUserService userService;
	private final static Logger log = LoggerFactory
			.getLogger(EduRestController.class);

	@RequestMapping(value = "sayhello", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String sayhello() {
		
		log.info("Entering sayHello");
		
		User user = new User();
		
		user.setFirstname("Kumar");
		user.setLastname("Jeyaprakasam");
		
		repository.save(user);
		
		log.info("AFter save "+ user.getPkId());
		
		log.info(" Fetching by last name"+repository.findByLastname("Jeyaprakasam"));
		
		log.info(repository.count()+"");
		
//		userService.save(user);

		return "Hi How are you";
	}
}
