package com.demo.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;

import com.demo.entity.Course;

class CourseRepositoryTest {

	@Autowired
	CourseRepository repository;
	
	@Test
	public void findId_basic() {
		Course course = repository.findById(101);
		assertEquals("JPA",course.getClass());
	}
	
	@Test
	@DirtiesContext
	public void deleteId_basic() {
		repository.deleteById(102);
		assertNull(repository.findById(102));
	}

}
