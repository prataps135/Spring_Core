package com.demo.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@NamedQuery(name = "find_all_person",query = "select p from Person p")
//@Table(name="person")
public class Person {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="name")
	private String name;
	private String location;
	private Date birthDate;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String location, Date dateBirth) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = dateBirth;
	}
	
	public Person(String name, String location, Date dateBirth) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = dateBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDateBirth() {
		return birthDate;
	}
	public void setBirthDate(Date dateBirth) {
		this.birthDate = dateBirth;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", dateBirth=" + birthDate + "]";
	}
	
	
}
