package com.springboot.jpa.crud;

import org.springframework.context.ApplicationContext;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entities.User;

public class UpdateUser {
	
	ApplicationContext ctx;
	UserRepository repo;
	
	public UpdateUser(ApplicationContext ctx) {
		this.ctx = ctx;
		this.repo = this.ctx.getBean(UserRepository.class);
	}
	
	public User updateUserById() {
		User u = repo.findById(1).get();
		u.setAge(22);
		return repo.save(u);
	}

}
