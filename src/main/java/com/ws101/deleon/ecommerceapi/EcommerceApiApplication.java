package com.ws101.deleon.ecommerceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the EcommerceApi Spring Boot application.
 * 
 * This application provides a RESTful API for managing an e-commerce product catalog.
 * It uses in-memory data storage to demonstrate HTTP fundamentals and REST principles.
 * 
 * @author Kent Jeanne S. De Leon
 * @author Keniel Drew D. De Asis
 * @version 1.0.0
 * @since 2026-04-24
 */
@SpringBootApplication
public class EcommerceApiApplication {

	/**
	 * Main method to launch the Spring Boot application.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApiApplication.class, args);
	}
}