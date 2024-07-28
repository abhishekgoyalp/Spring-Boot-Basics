package com.springboot.jpa.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entities.User;

public class CreateUser {
	
	ApplicationContext ctx;
	UserRepository repo;
	public CreateUser(ApplicationContext ctx) {
		this.ctx = ctx;
		this.repo = this.ctx.getBean(UserRepository.class);
	}
	
	public User createAUser() {
		User a = new User();
		a.setName("Chandu");
		a.setAge(30);
		a.setGender('M');
		return repo.save(a);
	}
	
	public Iterable<User> createMultipleUser() {
		List<User> userList = new ArrayList<>();
		userList.add(new User("Divya", 30, 'F'));
		userList.add(new User("Megha", 32, 'F'));
		userList.add(new User("Deepak", 30, 'M'));
		userList.add(new User("Suraj", 33, 'M'));
		return repo.saveAll(userList);
	}
}
