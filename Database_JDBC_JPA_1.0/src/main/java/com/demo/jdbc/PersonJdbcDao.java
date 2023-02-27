package com.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	// Jdbc template is used to connect with DB
	JdbcTemplate jdbcTemplate;
	
	public List<Person> findAll(){
		// After query execution it will map it to bean class
		// which we have created
		return jdbcTemplate.query("select * from Person",
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	@SuppressWarnings("deprecation")
	public Person find(int id){
		// Query by id of person
		return jdbcTemplate.queryForObject(
				"select * from Person where id =?",new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
}
