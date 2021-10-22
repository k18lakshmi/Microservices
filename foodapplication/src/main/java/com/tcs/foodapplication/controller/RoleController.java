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

import com.tcs.foodapplication.model.Role;
import com.tcs.foodapplication.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@GetMapping("/roles")
	public List<Role> getRole() {
		return roleService.findAll();
	}
	
	@GetMapping("/roles/{id}")
	public Role getRoleById(@PathVariable int id) {
		return roleService.findById(id).get();
	}
	
	@PostMapping("/roles")
	public void addRoles(@RequestBody Role role) {
		roleService.save(role);
	}
	@PutMapping("/roles/{id}")
	public void editRole(@PathVariable int id,@RequestBody Role role) {
		roleService.update(id, role);
	}
	@DeleteMapping("/roles/{id}")
	public void deleteRole(@PathVariable int id) {
		roleService.delete(id);
	}
	
}
