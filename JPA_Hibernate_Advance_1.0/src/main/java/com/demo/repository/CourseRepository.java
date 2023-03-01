package com.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Course;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {
	@Autowired
	EntityManager em;
	
	public Course findById(int id) {
		Course find = em.find(Course.class, id);
		return find;
	}
	public Course save(Course course) {
//		if(course.getId() == null) {
//			em.persist(course);
//		}else {
//			em.merge(course);
//		}
		em.persist(course);
		return course;
	}
	public void deleteById(int id) {
		Course course = findById(id);
		em.remove(course);		
	}
}
