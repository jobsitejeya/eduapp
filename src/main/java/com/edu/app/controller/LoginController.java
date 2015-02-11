package com.edu.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/login")
public class LoginController {

	private final static Logger log = LoggerFactory
			.getLogger(LoginController.class);

	@RequestMapping(value = "form")
	public String login() {
		log.info("Entering login.....");
		return "login";
	}

	@RequestMapping(value = "error")
	public String error(ModelMap model) {

		log.info("Entering error");
		log.info(model.toString());

		model.addAttribute("error", true);

		return "login";

	}

}
