package com.tcs.foodapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.foodapplication.model.Role;
import com.tcs.foodapplication.repository.RoleRepository;
import com.tcs.foodapplication.repository.UserRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository rolerepository;
	
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return rolerepository.findAll();
	}

	@Override
	public Optional<Role> findById(int id) {
		// TODO Auto-generated method stub
		return rolerepository.findById(id);
	}

	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub
		rolerepository.save(role);
	}

	@Override
	public void update(int id, Role role) {
		// TODO Auto-generated method stub
		rolerepository.save(role);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rolerepository.deleteById(id);
	}

}