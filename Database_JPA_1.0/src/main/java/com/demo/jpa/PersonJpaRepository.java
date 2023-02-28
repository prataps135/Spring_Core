package com.demo.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

	//Connect to DB
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id) {
		// Simple JPA implementation
		return entityManager.find(Person.class, id);
	}
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_person",Person.class);
		return namedQuery.getResultList();
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	
	public Person update(Person person) {
		return entityManager.merge(person);
	}
	
	public void deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}
	
}
