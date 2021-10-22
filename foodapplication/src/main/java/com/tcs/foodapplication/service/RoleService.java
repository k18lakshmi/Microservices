package com.tcs.foodapplication.service;

import java.util.List;
import java.util.Optional;

import com.tcs.foodapplication.model.Role;

public interface RoleService {

	public static final List<Role> roles = null;
	public List<Role> findAll();  //method declaration only
	public Optional<Role> findById(int id);
	public void save(Role role);
	public void update(int id, Role role);
	public void delete(int id);
	
}
