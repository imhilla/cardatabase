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
 * Types of DI
 * 1. Constructor injection :- Dependencies are passed to a client class
 * Constructor
 * public class Car {
 * private Owner owner;
 * 
 * public Car(Owner owner) {
 * this.owner = owner;
 * }
 * }
 * 2. Setter injection :- Dependencies are provided through setters.
 * 
 * public class Car {
 * private Owner owner;
 * 
 * public void setOwner(Owner owner) {
 * this.owner = owner;
 * }
 * }
 * here the dependency is now passed in the setter as an argument
 * 
 */

/**
 * 
 * USING DI IN SPRING BOOT
 * Spring boot scans your application classes and registers classes with certain
 * annotations (@service, @repository, @controller) as spring beans. The beans
 * can then be injected using an @Autowired annotations
 *
 * public class Car {
 * 
 * @Autowired
 *            private Owner owner;
 *            }
 * 
 * 
 */

/**
 * The spring framework comprises several modules such as IOC, AOP, DAO,
 * Context, ORM, WEB MVC
 */

/**
 * Inversion of Control and Dependency injection
 * These are the design patterns that are used to remove dependency from the
 * programming code. They make code easier to test and maintain
 */

/**
 * IoC container is responsible to instantiate, configure and assemble the
 * objetcs, the IOC container gets information from the XML file and work
 * accordingly
 * 
 * Main tasks are
 * 1. To instantiate the application class.
 * 2. To configure the object.
 * 3. To assemble the dependencies between objetcs.
 * 
 * There are two types of IOC containers
 * 1. BeanFactory.
 * 2. Application context
 */