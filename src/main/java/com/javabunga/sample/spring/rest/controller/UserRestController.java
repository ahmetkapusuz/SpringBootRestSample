package com.javabunga.sample.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javabunga.sample.spring.rest.model.User;
import com.javabunga.sample.spring.rest.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	UserService userService;

	@RequestMapping("/user")
	public User getUser(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
		return userService.createUser(name, surname);
	}

}
