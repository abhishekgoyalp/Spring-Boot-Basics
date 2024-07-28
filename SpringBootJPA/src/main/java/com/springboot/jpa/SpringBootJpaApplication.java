package com.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.jpa.crud.CreateUser;
import com.springboot.jpa.crud.DeleteUser;
import com.springboot.jpa.crud.ReadUser;
import com.springboot.jpa.crud.UpdateUser;
import com.springboot.jpa.entities.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootJpaApplication.class, args);
		
		/** For the create operation
		CreateUser create = new CreateUser(ctx);
		// For creating a user
		create.createAUser();
		
		// For creating multiple users
		create.createMultipleUser();
		*/
		
		/**
		UpdateUser update = new UpdateUser(ctx);
		
		// For updating a user with id
		update.updateUserById();
		*/
		
		/**
		ReadUser read = new ReadUser(ctx);
		
		// For reading a single user by id
		System.out.println("Fetching single user\n" +  read.readUserById());
		
		// For reading multiple user by id
		Iterable<User> users = read.readUserByAllId();
		System.out.println("Fetching Multiple users with ids");
		users.forEach(System.out::println);
		
		// For reading all the users
		Iterable<User> allUser = read.readAllUsers();
		System.out.println("Fetching All users");
		allUser.forEach(System.out::println);
		*/
		
		/**
		DeleteUser delete = new DeleteUser(ctx);
		// For delete a single user
		delete.deleteUserById();
		
		// For deleting multiple users by ids
		delete.deleteMultipleUsersById();
		
		// For delete all the users
		delete.deleteAllUser();
		*/
	}

}
