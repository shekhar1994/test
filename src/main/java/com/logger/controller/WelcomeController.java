package com.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public String welcome(String name) {
		
		logger.trace("This is TRACE level logging...");
		logger.debug("This id DEBUG level logging...");
		logger.info("This is INFO level logging...");
		
		logger.warn("This is WARN level logging...");
		logger.error("This is ERROR level logging...");
				
		
		return "Welcome to Bikkad IT";
	}
	
}
