package com.tcs.foodapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.foodapplication.model.User;
import com.tcs.foodapplication.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> getUser() {
		return userService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.findById(id).get();
	}
	
	@PostMapping("/users")
	public void addUsers(@RequestBody User user) {
		userService.save(user);
	}
	@PutMapping("/users/{id}")
	public void editUser(@PathVariable int id,@RequestBody User user) {
		userService.update(id, user);
	}
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.delete(id);
	}
		
}
