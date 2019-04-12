package com.capgemini.spring.mvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.spring.mvc.model.dao.PersonDao;
import com.capgemini.spring.mvc.model.entity.Person;
import com.capgemini.spring.mvc.model.entity.PersonService;



@Service
public class PersonServiceImpl implements PersonService {

	
	@Autowired
	private PersonDao dao;
	
	@Override
	public void addNew(Person person) {
		dao.addNew(person);
		// TODO Auto-generated method stub

	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int personId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person getPersonById(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

}
