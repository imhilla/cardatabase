package com.hillary.cardatabase;

import java.util.Arrays;

import com.hillary.cardatabase.domain.Car;
import com.hillary.cardatabase.domain.CarRepository;
import com.hillary.cardatabase.domain.Owner;
import com.hillary.cardatabase.domain.OwnerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository orepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Cardatabase started, we are tracking the app");
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner("John", "Johnson");
		Owner owner2 = new Owner("Mary", "Robinson");
		orepository.saveAll(Arrays.asList(owner1, owner2));
		Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 5900, owner1);
		Car car2 = new Car("Nissan", "Leaf", "White", "SSJ-3002", 2022, 5900, owner2);
		Car car3 = new Car("Toyota", "Priush", "Silver", "KKO-0212", 2020, 3900, owner2);
		repository.saveAll(Arrays.asList(car1, car2, car3));
		for (Car car : repository.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}
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

/**
 * 
 * Basics of ORM, JPA, and Hibernate
 * ORM is a technique that allows you to fetch from and manipulate a database by
 * using an object-oriented
 * paradigm.
 * 
 * 
 * Java Persistent Api provides object rlational mapping for java developers.
 * 
 * The JPA entity is a java class that presents the structure of a database
 * table.
 * The fields of an entity class present the columns of the database tables.
 * 
 * Hibernate is the most popular java based JPA implementation and is used in
 * spring boot by default.
 * 
 * 
 * Creating the entity class
 * An entity class is a simple java class that is annotated with JPA's @Entity
 * annotations.
 * Entity classes use the standard javabean naming conventions and have proper
 * getter and setter methods
 * JPA creates a database table called by the name of the class when the
 * application is initialized.
 * If you want to use some other name for the database table, you can use
 * the @Table annotations in your entity class.
 */