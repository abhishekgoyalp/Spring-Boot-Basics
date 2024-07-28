package com.springboot.jpa.crud;

import java.util.List;

import org.springframework.context.ApplicationContext;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entities.User;

public class ReadUser {
	ApplicationContext ctx;
	UserRepository repo;
	
	public ReadUser(ApplicationContext ctx) {
		this.ctx = ctx;
		this.repo = this.ctx.getBean(UserRepository.class);
	}
	
	public User readUserById() {
		return repo.findById(2).get();
	}
	
	public Iterable<User> readUserByAllId() {
		return repo.findAllById(List.of(1,2,152, 153));
	}
	
	public Iterable<User> readAllUsers(){
		return repo.findAll();
	}
}
