package com.hillary.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Cardatabase started, we are tracking the app");
	}
};

/**
 * Dependency injection is a software development technique where we can create
 * objects
 * that depend on other objects. DI helps with interaction between classes but
 * at some time keeps the classes independent.
 * 
 * There are three types of classes in DI
 * 1. Service (is a class that can be used, this is the dependency)
 * 2. Client (class that uses the dependency)
 * 3. Injector (passes the dependency (service) to the dependent client)
 * 
 * DI makes classes loosely coupled. This means that the creation of client
 * dependencies is separated from client's behavior, which makes unit testing
 * easier.
 * 
 */