package com.edu.app.listener;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class EduAppContextIntilizer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	
	private static final Logger logger = LoggerFactory.getLogger(EduAppContextIntilizer.class);
	
	public void initialize(ConfigurableApplicationContext appContext) {		
		logger.info("initialize called");		
		
		Properties properties = System.getProperties();
		
		if(null != properties.get("RDS_HOME") ){
			logger.info(" prod environment");
		}
		else{
			appContext.getEnvironment().setActiveProfiles("dev");		
			
			logger.info(" dev environment");
		}
		logger.info("exiting initialize ");
			
	}

}
