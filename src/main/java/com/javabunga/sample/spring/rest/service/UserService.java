package com.javabunga.sample.spring.rest.service;

import org.springframework.stereotype.Service;

import com.javabunga.sample.spring.rest.model.User;

@Service
public class UserService {

	public User createUser(String name, String surname) {

		User u = new User();
		u.setName(name);
		u.setSurname(surname);

		return u;

	}

}
