package com.demo;

import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entity.Person;
import com.demo.jdbc.PersonJdbcDao;

import ch.qos.logback.classic.Logger;


@SpringBootApplication
public class Application implements CommandLineRunner{
	
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersonJdbcDao dao;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All user -> {}",dao.findAll());
		logger.info("User of id 10001 -> {}",dao.findById(10001));
		logger.info("Deleting 10001 -> No. of rows affected - {}",dao.deleteById(10002));
		logger.info("Inserting 10004 -> {}",dao.insert(new Person(10004,"bajrang","bikaner",new Date())));
	}

}
