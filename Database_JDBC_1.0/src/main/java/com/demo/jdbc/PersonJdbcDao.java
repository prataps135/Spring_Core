package com.demo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import org.hibernate.type.descriptor.java.JdbcTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	// Jdbc template is used to connect with DB
	JdbcTemplate jdbcTemplate;
	
	// Manually do mapping in bean class
	// by defining own RowMapper()
	class PersonRowMapper implements RowMapper<Person>{
		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getTimestamp("birth_date"));
			return person;
		}
		
	}
	
	public List<Person> findAll(){
		// After query execution it will map it to bean class
		// which we have created
		return jdbcTemplate.query("select * from Person",
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	@SuppressWarnings("deprecation")
	public Person findById(int id){
		// Query by id of person
		return jdbcTemplate.queryForObject(
				"select * from Person where id =?",new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from person where id =?"
				,new Object[] {id});
	}
	
	public int insert(Person person) {
		return jdbcTemplate.update("insert into person (id,name,location,birth_date) values (?,?,?,?)",
				new Object[] {person.getId(),person.getName(),person.getLocation(),
						new Timestamp(person.getDateBirth().getTime())});
	}
	
	public int update(Person person) {
		return jdbcTemplate.update("update person set name = ?,"
				+ " location = ?, birth_date = ? "
				+" where id = ? ",
				new Object[] {person.getName(),person.getLocation(),
						new Timestamp(person.getDateBirth().getTime()),
						person.getId()});
	}
	
	
	
}
