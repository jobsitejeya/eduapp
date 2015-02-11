package com.edu.app.controller;

import javax.sql.DataSource;

import com.edu.app.controller.common.AbstractController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/home")
public class HomeController extends AbstractController{
	
	private final static Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private DataSource datasource;

	@Secured({"ROLE_USER"})
	@RequestMapping(method=RequestMethod.GET)
	public String home() throws Exception{
		log.info("Home called.... {}", getUsername());
		log.info("Roles : {}", userContext.getRoles());
		log.info("---> "+datasource.getConnection().getAutoCommit());
		return "home";
	}
	
	@RequestMapping("/index")
	public String home1() throws Exception{
		return "home";
	}

}
