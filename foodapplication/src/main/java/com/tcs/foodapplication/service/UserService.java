package com.tcs.foodapplication.service;

import java.util.List;
import java.util.Optional;

import com.tcs.foodapplication.model.User;


public interface UserService {

	public static final List<User> users = null;
	public List<User> findAll();  //method declaration only
	public Optional<User> findById(int id);
	public void save(User user);
	public void update(int id, User user);
	public void delete(int id);
	
}
