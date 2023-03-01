package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.demo.entity.Course;
import com.demo.repository.CourseRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	CourseRepository repository;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course("microservices"));
		Course findById = repository.findById(1);
		logger.info("Course 101 -> {}",findById);
	}

}
