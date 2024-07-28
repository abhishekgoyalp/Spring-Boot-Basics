package com.springboot.jpa.crud;

import java.util.List;

import org.springframework.context.ApplicationContext;

import com.springboot.jpa.dao.UserRepository;

public class DeleteUser {

	ApplicationContext ctx;
	UserRepository repo;
	
	public DeleteUser(ApplicationContext ctx) {
		this.ctx = ctx;
		this.repo = this.ctx.getBean(UserRepository.class);
	}
	
	public void deleteUserById() {
		repo.deleteById(1);
	}
	
	public void deleteMultipleUsersById() {
		repo.deleteAllById(List.of(2, 102));
	}
	
	public void deleteAllUser() {
		repo.deleteAll();
	}
}
